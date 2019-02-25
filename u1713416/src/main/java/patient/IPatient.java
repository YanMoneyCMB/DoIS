package patient;

import java.util.Date;

/**
 * Interface for patient record.
 * 
 * <p>PLEASE DO NOT CHANGE.
 * 
 * @author Till Bretschneider
 *
 */
public interface IPatient {

  /**
   * Make copy of record.
   * 
   * @param p record to be copied.
   */
  public void copy(Patient p);

  /**
   * Return first name.
   * 
   * @return first name
   */
  public String getFirstName();

  /**
   * Return patient's id.
   * 
   * @return id
   */
  public Long getId();

  /**
   * Return last name.
   * 
   * @return last name
   */
  public String getLastName();

  /**
   * Return registration date.
   * 
   * @return registration date
   */
  public Date getRegistrationDate();

  /**
   * Return virus sequence.
   * 
   * @return virus sequence
   */
  public String getVirusSequence();

  /**
   * Set first name.
   * 
   * @param firstname name to be set.
   * @return true
   */
  public boolean setFirstName(String firstname);

  /**
   * Set patient's id.
   * 
   * @param id id to be set
   * @return true
   */
  public boolean setId(Long id);

  /**
   * Set last name.
   * 
   * @param lastname name to be set.
   * @return true
   */
  public boolean setLastName(String lastname);

  /**
   * Set registration date.
   * 
   * @param date date to be set.
   * @return true
   */
  public boolean setRegistrationDate(Date date);

  /**
   * Set virus sequence.
   * 
   * @param sequence sequence to be set.
   * @return true
   */
  public boolean setVirusSequence(String sequence);

}