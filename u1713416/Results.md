# CS126 Assignment - Results


# Student Id: 1713416


<style
type="text/css">
div.marker_feedback{color:red;font-weight:bold}
</style>








## Problem 1: Create an array list you can iterate over using a "for-each loop"


I have provided a solution to the problem by modifying [MyArrayList.java](./src/main/java/adt/list/MyArrayList.java): **Yes

<div class='marker_feedback'>Marker feedback:</div>

## Problem 2: Investigate the class `Patient` and implement a sortable `PatientArrayList`
**a)** I have completed [PatientArrayList.java](./src/main/java/patient/PatientArrayList.java): **Yes

<div class='marker_feedback'>Marker feedback:</div>

**b)** I have implemented the following sorting method in [PatientArrayList.java](./src/main/java/patient/PatientArrayList.java) (describe your method):
Merge sort which takes in index of the first element in an array/subarray and index of the last element of the array/subarray.


<div class='marker_feedback'>Marker feedback:</div>

**c)** The computational complexity of my sorting method in [PatientArrayList.java](./src/main/java/patient/PatientArrayList.java) is (state the complexity and discuss why you have chosen this method):

Worst time complexity : O(n*log(n));
Best time complexity : O(n*log(n));
One would choose this method to ensure stability of the algorithm, as well as least time complexity in comparison to other methods.

<div class='marker_feedback'>Marker feedback:</div>

**d)** A list of 20 patients sorted by their Id, which is output by `problem2()` in [WirusProblemSolutions.java](./src/main/java/wirus/WirusProblemSolutions.java) (copy for example the last 20 entries of the entire list from the console, and paste them here):

6158783229 	Myers 	Lily 	28/01/2018 	CACGGAAAAGATGCTGGT 	
6158786789 	Maddox 	Jordan 	01/02/2018 	CACGGAAAAGATGCTGGT 	
6158982923 	Garner 	Ellie 	21/01/2018 	CACGGAAAAGATGCTGGT 	
6159286155 	Parks 	Faith 	02/02/2018 	CACGGAAAAGATGCTGGT 	
6159475539 	Cherry 	Justin 	29/01/2018 	CACGGAAAAGATGCTGGT 	
6159678664 	Chambers 	Kimberly 	02/02/2018 	CACGGAAAAGATGCTGGT 	
6159683181 	Burnett 	William 	04/02/2018 	CACGGAAAAGATGCTGGT 	
6159765457 	Sharp 	Stella 	31/01/2018 	CACGGAAAAGATGCTGGT 	
6159874574 	Blanchard 	Jace 	31/01/2018 	CACGGAAAAGATGCTGGT 	
6160006908 	Hoover 	Addison 	26/01/2018 	CACGGAAAAGATGCTGGT 	
6160183714 	Madden 	Piper 	04/02/2018 	CACGGAAAAGATGCTGGT 	
6160346804 	Herman 	Anthony 	01/02/2018 	CACGGGAAAGATGCTGGT 	
6160578074 	Petersen 	Leah 	01/02/2018 	CACGGAAAAGATGCTGGT 	
6160620230 	Holloway 	Trinity 	30/01/2018 	CACGGAAAAGATGCTGGT 	
6160816739 	Dixon 	Nolan 	02/02/2018 	CACGGGAAAGATGCTGGT 	
6160824191 	Dean 	Jeremiah 	04/02/2018 	CACGGGAAAGATGCTGGT 	
6160828529 	Bolton 	Luis 	04/02/2018 	CACGGAAAAGATGCTGGT 	
6161772086 	Wheeler 	Mackenzie 	02/02/2018 	CACGGGAAAGATGCTGGT 	
6163140175 	Tyler 	Caroline 	02/02/2018 	CACGGAAAAGATGCTGGT 	
6164181210 	Atkins 	Madeline 	31/01/2018 	CACGGAAAAGATGCTGGT 	
6164331092 	Furter 	Frank_N 	01/02/2018 	CACGGGAAAGATGTTCGT

<div class='marker_feedback'>Marker feedback:</div>

## Problem 3: Use a Set to list the different virus sequences

**a)** I have created the object `Set<String> dnaset` in `problem3a()` of [WirusProblemSolutions.java](./src/main/java/wirus/Wirus.java) : **Yes

<div class='marker_feedback'>Marker feedback:</div>

**b)** The computational complexity of adding a new virus sequence to the set is (explain why):

O(n), as method add() has to check for duplicates in the set.

<div class='marker_feedback'>Marker feedback:</div>


**c)** A list of patients with the virus sequence “CACGGGAAAGATGTTCGT”:

6164331092 	Furter 	Frank_N 	01/02/2018 	CACGGGAAAGATGTTCGT

<div class='marker_feedback'>Marker feedback:</div>

**d)** Why, in our example, would using a search tree or a HashMap not necessarily help to find patients with a specific virus sequence faster?
Explain under which conditions you could expect a dramatic speed-up, and when not.

Because most of patients would have same virus sequence, making the HashMap having a lot of collisions, storing patients at just 3 values. Then,for example,if one is searching for patients with the same virus sequence and registration date, algorithm will have an O(1) complexity finding the list of patients with the same virus sequence, but then O(n) searching through that list to find specific patients. If the set of virus sequences present was much larger, then HashMap would be much more useful.

<div class='marker_feedback'>Marker feedback:</div>


##Problem 4: Use a HashMap to find patients by their Id

**a)** Using a `HashMap<Long, Patient>` in `problem4()` of [WirusProblemSolutions.java](./src/main/java/wirus/Wirus.java) I found that the patient with Id 6164331092 is:

6164331092 	Furter 	Frank_N 	01/02/2018 	CACGGGAAAGATGTTCGT

<div class='marker_feedback'>Marker feedback:</div>

**b)** The computational complexity of looking up an arbitrary patient by their Id using a HashMap is (explain why):

Best case O(1), Worst case is O(n). Worst case scenario will happen if all distinct IDs will be hashed to the same value(which is unlikely).

<div class='marker_feedback'>Marker feedback:</div>

## Problem 5: I have chosen option 5.1

### Problem 5.1: Number of patients admitted to hospital per calendar week

**a)** I have completed the file [PatientsPerWeekHistogram.java](./src/main/java/patient/PatientsPerWeekHistogram.java) which produces the following output: **Yes
Week:  49/2017, Number of patients:  1
Week:  51/2017, Number of patients:  2
Week:  52/2017, Number of patients:  12
Week:  1/2018, Number of patients:  52
Week:  2/2018, Number of patients:  217
Week:  3/2018, Number of patients:  839
Week:  4/2018, Number of patients:  3503
Week:  5/2018, Number of patients:  14875
Week:  6/2018, Number of patients:  500

I've added a sorted by date patient list to a TreeMap. Before adding it, registration dates were changed to a 'w/y' format and date was set as a key in the map. While adding, map was checked on whether it already contains the same key. If it did, then the value of the last KeyValue Pair was incremented and then added. If it didn't, a KeyValue Pair would be set with a value of 1.
When all patients are added, map consists of KeyValue Pairs, where dates are keys and values are a number of patients registered that week.
Then, use a foreach statement to get every entry in the entrySet of the TreeMap. For each entry, format the Date and print out a line stating how many patients were registered in which week.

<div class='marker_feedback'>Marker feedback:</div>

**b)** Results:

(If your answer in a) is **Yes**, replace this text with your result, and explain your approach)

<div class='marker_feedback'>Marker feedback:</div>


### Problem 5.2

**a)** I have completed the file [BinaryPatientTree.java](./src/main/java/patient/BinaryPatientTree.java): **Yes / No** (delete as appropriate)

(If your answer above is **Yes**, replace this text with a brief discussion of your approach)

<div class='marker_feedback'>Marker feedback:</div>

**b)** Results:

(If your answer in a) is **Yes**, replace this text with your result, and explain your approach)

<div class='marker_feedback'>Marker feedback:</div>
