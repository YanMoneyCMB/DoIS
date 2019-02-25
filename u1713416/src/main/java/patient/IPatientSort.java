package patient;

/**
 * This specific interface defines sorting of collection of Patients.
 * 
 * <p>PLEASE DO NOT MODIFY
 */
public interface IPatientSort {

  /**
   * Fields patients can be sorted along.
   *
   */
  public enum PatientSortableFields {
    /**
     * Patient's last name.
     */
    LASTNAME,
    /**
     * Patient's ID.
     */
    ID,
    /**
     * Registration date.
     */
    DATE;
  }

  /**
   * Sort the list by specified field.
   * 
   * @param name field to sort list by
   * @see PatientSortableFields
   */
  public void sort(PatientSortableFields name);

}