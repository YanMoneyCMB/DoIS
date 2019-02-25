package patient;

import java.util.Comparator;

import adt.list.MyArrayList;

/**
 * Implementation of a sortable list of patient's records.
 * 
 * <p>This is a specific implementation of {@link MyArrayList} extended by sorting records by
 * specified field.
 * 
 * <p>PLEASE COMPLETE
 *
 */
public class PatientArrayList extends MyArrayList<Patient> implements IPatientSort {

  private Comparator<Patient> comp;

  /**
   * Create empty list.
   */
  public PatientArrayList() {  
    super();
      
  }

  /*
   * (non-Javadoc)
   * 
   * @see patient.IPatientSort#sort(patient.IPatientSort.PatientSortableFields)
   */
  @Override
  public void sort(PatientSortableFields name) {
    // COMPLETE  
    //  Merge sort.
      comp = setComp(name);
      int lo = 0;
      int n = super.size() - 1;
      mergesort(lo,n);
     
  //  throw new RuntimeException("not yet implemented");
  }
  public void mergesort(int lo, int n) {
      int low = lo;
      int high = n;
      if (low >= high) {    //check if the list is empty
          return;
      }
      
      int mid = (low + high) / 2;   //middle position in the list
      mergesort(low,mid);
      mergesort(mid+1,high);
      int end_low = mid;
      int start_high = mid +1;
      while((lo<=end_low) && (start_high <= high)) {
          if (comp.compare(super.get(low),super.get(start_high)) < 0){
              low++;
          } else {
              Patient temp = super.get(start_high);
              for (int k = start_high - 1; k>=low; k--) {
                  super.set(k+1,super.get(k));
              }
              super.set(low,temp);
              low++;
              end_low++;
              start_high++;
          }
      }
  }

  /**
   * Compare patients records by date of registration.
   *
   */
  public class DateComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient a, Patient b) throws ClassCastException {
      return (a.getRegistrationDate().compareTo(b.getRegistrationDate()));
    }
  }

  /**
   * Compare patients records by ID.
   *
   */
  public class IdComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient a, Patient b) throws ClassCastException {
      return (a.getId().compareTo(b.getId()));
    }
  }

  /**
   * Compare patients records by name.
   *
   */
  public class NameComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient a, Patient b) throws ClassCastException {
      return (a.getLastName().compareTo(b.getLastName()));
    }
  }

  /**
   * Create and return specified comparator.
   * 
   * @param name name of requested comparator
   * @return instance of the comparator
   */
  public Comparator<Patient> setComp(PatientSortableFields name) {
    // COMPLETE
      if(name == PatientSortableFields.LASTNAME){
          comp = new NameComparator();
      }
      else if(name == PatientSortableFields.ID) {
          comp = new IdComparator();
      }
      else if (name == PatientSortableFields.DATE){
          comp = new DateComparator();
      }
   return comp;
  }

  /*
   * (non-Javadoc)
   * PLEASE DO NOT MODIFY
   * 
   * @see adt.list.MyArrayList#toString()
   */
  @Override
  public String toString() {
    if (this.isEmpty())
      return "[]";
    StringBuilder ret = new StringBuilder("ID \tLastname \tFirstname \tDate \tSequence\n");
    for (Patient p : this)
      ret.append(p.toString());
    return ret.toString();
  }

}
