#!/bin/bash - 
#===============================================================================
#
#          FILE: build.sh
# 
#         USAGE: ./build.sh 
#                This script must be run from top project folder, i.e folder
#                where src and data subfolders exist.  
# 
#   DESCRIPTION: Simple build script for Wirus CS126 coursework. 
# 
#       OPTIONS: [-hbcr], see help() 
#  REQUIREMENTS: java, javac
#          BUGS: Options -b and -r if specified together, must be in order
#                -br
#         NOTES: ---
#        AUTHOR: Piotr Baniukiewicz (baniuk), p.baniukiewicz@warwick.ac.uk
#  ORGANIZATION: 
#       CREATED: 16/01/18 09:42:05
#      REVISION: 1.0.0
#===============================================================================

set -o nounset                              # Treat unset variables as an error
set -e                                      # Exit on each error

OPTIND=1 # reset getopts variable

# remember current dir (project root)
projectRoot=$(pwd)
# our build folder will be located inside projectRoot
buildFolder="target/"


#---  FUNCTION  ----------------------------------------------------------------
#          NAME:  help
#   DESCRIPTION:  Show help
#    PARAMETERS:  ---
#       RETURNS:  ---
#-------------------------------------------------------------------------------
function help () {
    echo  "Script should be started from project root folder (where src and data
folders reside).

Usage: ${0##*/} [-hbcr]

    -h  display this help and exit
    -b  compile sources under src/java/main and put compiled classes to 
        projectRoot/target
    -c  clean projectRoot/target folder
    -r  run Wirus.java (this option must follow -b)

Examples:
     
    ./${0##*/} -br    Build and run Wirus project.
                      (note that reverse order -rb is not correct!!)

    "
}


#---  FUNCTION  ----------------------------------------------------------------
#          NAME:  clean
#   DESCRIPTION:  Clean workspace
#    PARAMETERS:  ---
#       RETURNS:  ---
#-------------------------------------------------------------------------------
function clean () {
   rm -rf "$buildFolder" 
}


#---  FUNCTION  ----------------------------------------------------------------
#          NAME:  build
#   DESCRIPTION:  Build the project and store results in buildFolder
#    PARAMETERS:  Path to file to build
#       RETURNS:  ---
#-------------------------------------------------------------------------------
function build () {
    # create build folder
    mkdir "$buildFolder"
    # go to sources
    cd src/main/java
    # compile redirecting results to build folder
    javac -d "$projectRoot/$buildFolder" -cp . "$1"
    echo "Build done, results are in $projectRoot/$buildFolder"
}


#---  FUNCTION  ----------------------------------------------------------------
#          NAME:  run
#   DESCRIPTION:  Run specified class
#    PARAMETERS:  Class to be executed
#       RETURNS:  
#-------------------------------------------------------------------------------
function run () {
    cd "$projectRoot" # where data folder is
    java -cp "$projectRoot/$buildFolder" "$1"
}

# parse cmd options
while getopts hbcr opt; do 
    case $opt in
        h)
            help
            exit 0
            ;;
        b)
            echo "Build..."
            clean
            build ./wirus/Wirus.java
            ;;
        c)
            echo "Clean..."
            clean
            exit 0
            ;;
        r)
            echo "Run..."
            run wirus.Wirus
            ;;
        *)
            help
            exit 1
            ;;
    esac
done
shift "$((OPTIND-1))"   # Discard the options
if [ $OPTIND -eq 1 ]; then help; fi # no options specified
