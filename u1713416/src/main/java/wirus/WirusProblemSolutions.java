package wirus;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.TreeMap;
import java.text.SimpleDateFormat;
import java.util.Map;


import adt.set.Set;
import patient.BinaryPatientTree;
import patient.Patient;
import patient.PatientArrayList;
import patient.PatientFile;
import patient.IPatientSort.PatientSortableFields;
import adt.map.HashMap;

/**
 * Assignment solution.
 * 
 * <p>Please complete the methods in this class, by providing solutions to the problems specified in
 * Wirus.pdf. You must
 * not modify the signatures of these methods (name, parameters, modifiers, etc). Note also that:
 * 
 * <ol>
 * <li>All methods are defined as static, therefore they should contain independent and standalone
 * code.
 * <li>Take care about returning correct values. We will use an automated test suite to validate
 * your results.
 * <li>Any output directed to the console will be ignored when testing your program, you can freely
 * use it for your
 * own purposes.
 * <li>The application entry, which contains main(), is in {@link Wirus}, which you can use for
 * running your program and calling the methods in {@link WirusProblemSolutions}. Please note
 * that most methods require {@link PatientArrayList} as parameter, which is returned by
 * {@link #problem2()}. The program
 * flow proposed in {@link Wirus} is correct as long as you do not modify the contents of
 * {@link PatientArrayList}
 * in any of these methods (as Lists are passed as references).
 * </ol>
 * 
 * <p>PLEASE MODIFY
 * 
 */
public class WirusProblemSolutions {

  public static String directory = "data/"; // set appropriate path to directory which contains your
                                            // YOURITCODE.dat
  public static String file = "u1713416.dat"; // FIXME Change to YOURITCODE.dat

  /**
   * Please put your solution of problem 2 here.
   * 
   * @return Sorted by ID list of patients read from file.
   * @throws ParseException
   * @throws IOException
   */
  public static PatientArrayList problem2() throws IOException, ParseException {
       System.out.println("\n\n\n\nProblem 2\n\n\n\n");
    PatientArrayList patients = null;
      patients = PatientFile.read(directory+file);
      
    patients.sort(PatientSortableFields.ID);
      System.out.println(patients.toString());
      

    // Problem 2d: create PatientArrayList patients by reading in a list of patients using
    // PatientFile.read()

    // Problem 2d: sort patients list by lastname, and print

    // return sorted list of patients
    return patients;
  }

  /**
   * Please put your solution of problem 3a here.
   * 
   * @param patients read in from file. This could for example be the output from
   *        {@link #problem2()} as shown in {@link Wirus}
   * @return Set virus sequences
   * @throws IOException
   * @throws ParseException
   */
  public static Set<String> problem3a(PatientArrayList patients)
          throws IOException, ParseException {

    Set<String> dnaset = new Set<String>();
    System.out.print("\n\n\n\nProblem 3a\n\n\n\n");

    // Problem 3a: create a Set for probing which DNA Virus sequences are present
    for(int i = 0;i< patients.size();i++){
        Patient p = patients.get(i);
        String virus = p.getVirusSequence();
        if(dnaset.contains(virus) == false){    
            dnaset.add(virus);
        }
    }
      System.out.println(dnaset.toString());
    // return set of virus sequences
    return dnaset;
  }

  /**
   * Please put your solution of problem 3c here.
   * 
   * @param patients read in from file. This could for example be the output from
   *        {@link #problem2()} as shown in {@link Wirus}
   * @return List of patients with specified virus sequence. Please create new
   *         {@link PatientArrayList} and add to it patients that meet criteria.
   * @throws IOException
   * @throws ParseException
   */
  public static PatientArrayList problem3c(PatientArrayList patients)
          throws IOException, ParseException {

    PatientArrayList patientsWithSequence = new PatientArrayList();
    System.out.print("\n\n\n\nProblem 3c\n\n\n\n");
      
    // Problem 3c: find patients with the mysterious sequence using brute force
      for (int i = 0; i < patients.size(); i++){
          Patient p = patients.get(i);
          
          if (p.getVirusSequence().equals("CACGGGAAAGATGTTCGT")){
              patientsWithSequence.add(p);
          }
          
      }
      System.out.println(patientsWithSequence.toString());
    return patientsWithSequence;
  }

  /**
   * Please put your solution of problem 4 here.
   * 
   * @param patients read in from file. This could for example be the output from
   *        {@link #problem2()} as shown in {@link Wirus}
   * @return Patient with specified ID
   */
  public static Patient problem4(PatientArrayList patients) {

    Patient patient = null;
    System.out.print("\n\n\n\nProblem 4\n\n\n\n");

    // Problem 4: use a HashMap to identify the patient with Id 6164331092
      HashMap<Long,Patient> map = new HashMap();
      for(int i= 0; i<patients.size();i++){
          map.add(patients.get(i).getId(),patients.get(i));
      } //add all patients to the HashMap
      Long id = 6164331092L;
      patient = map.get(id);
    // return patient with Id 6164331092
      System.out.println(patient.toString());
    return patient;

  }

  /**
   * Please put your solution of problem 5.1 here.
   * 
   * @param patients read in from file. This could for example be the output from
   *        {@link #problem2()} as shown in {@link Wirus}
   * @return Map<Date, num of patients>
   * @throws ParseException
   */
  public static java.util.Map<Date, Integer> problem5_1(PatientArrayList patients)
          throws ParseException {
      
      System.out.print("\n\n\n\nProblem 5 - Option 1\n\n\n\n");

    java.util.Map<Date, Integer> map = new TreeMap();
      patients.sort(PatientSortableFields.DATE);
      String pattern = "w/y";
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
      
      for(int i = 0; i<patients.size();i++){
          Date new_date = new Date();
          new_date=simpleDateFormat.parse(simpleDateFormat.format(patients.get(i).getRegistrationDate()));
          
          patients.get(i).setRegistrationDate(new_date);
        if(map == null){
            map.put(new_date,1);
        }
         else{
             
           if(map.containsKey(new_date) == true){
                int value= map.get(new_date) + 1;
                map.put(new_date,value);
            }
            else if (map.containsKey(new_date) == false){
                map.put(new_date,1);
            }
         }
          
      }
      for (Map.Entry<Date,Integer> entry : map.entrySet()) {
        int number = entry.getValue();
        String date =simpleDateFormat.format(entry.getKey());
      System.out.println("Week:  "+date+", Number of patients:  "+number);
   }


    // Possible strategy: use a HashMap (java.util.HashMap<Date, Integer>) and/or a TreeMap
    // (java.util.Map<Date, Integer>), or other classes of the Java Collections Framework which you
    // think are appropriate.

    // Before adding a date to a Map, create a String from the patient file using the
    // SimpleDateFormat "w/y".
    // Subsequently, parse that String to convert it back to a Date object, which will effectively
    // bin all
    // dates that occur within one week to have the Date of "w/y".

    // The Integer value that is stored in the HashMap/TreeMap together with the Date key
    // should be incremented whenever you add a new Date for which entries already
    // exist.

    // If using a HashMap you can easily generate a sorted TreeMap from it (java.util.Map<Date,
    // Integer> treeMap).

    // All that remains to be done is to iterate over the members of the TreeMap and
    // print them.

    // Note that you must return a java.util.Map<Date, Integer> structure, which is sorted

    // You can use your very own approach to find the solution to this problem.
    // However, you must return a sorted java.util.Map<Date, Integer> structure for automated
    // testing your results.
    return map;

  }

  /**
   * Please put your solution of problem 5.2 here.
   * 
   * <p>Please note implementation requirements for {@link BinaryPatientTree} class.
   * 
   * @param patients read in from file. This could for example be the output from
   *        {@link #problem2()} as shown in {@link Wirus}
   * @return List of patients whose first letters match a specific string
   * @see BinaryPatientTree
   */
  public static PatientArrayList problem5_2(PatientArrayList patients) {
return null;
   

  }

}
