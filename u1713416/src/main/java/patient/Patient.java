package patient;

import java.text.SimpleDateFormat;

// created by Till Bretschneider

import java.util.Date;

/**
 * Implementation of patient's record.
 * 
 * <p>PLEASE DO NOT MODIFY
 *
 */
public class Patient implements IPatient {

  private Date date;
  private String firstname;
  private Long id;
  private String lastname;
  private String sequence;

  /**
   * 
   */
  public Patient() {
    id = 0L;
    firstname = null;
    lastname = null;
    date = null;
    sequence = null;
  }

  /**
   * @param id
   * @param firstname
   * @param lastname
   * @param date
   * @param sequence
   */
  public Patient(Long id, String firstname, String lastname, Date date, String sequence) {
    this.id = id;
    this.firstname = firstname;
    this.lastname = lastname;
    this.date = date;
    this.sequence = sequence;
  }

  @Override
  public void copy(Patient p) {
    id = p.id;
    firstname = p.firstname;
    lastname = p.lastname;
    date = p.date;
    sequence = p.sequence;
  };

  @Override
  public String getFirstName() {
    return this.firstname;
  };

  @Override
  public Long getId() {
    return this.id;
  };

  @Override
  public String getLastName() {
    return this.lastname;
  };

  @Override
  public Date getRegistrationDate() {
    return this.date;
  };

  @Override
  public String getVirusSequence() {
    return this.sequence;
  };

  @Override
  public boolean setFirstName(String firstname) {
    this.firstname = firstname;
    return true;
  };

  @Override
  public boolean setId(Long id) {
    this.id = id;
    return true;
  };

  @Override
  public boolean setLastName(String lastname) {
    this.lastname = lastname;
    return true;
  };

  @Override
  public boolean setRegistrationDate(Date date) {
    this.date = date;
    return true;
  };

  @Override
  public boolean setVirusSequence(String sequence) {
    this.sequence = sequence;
    return true;
  }

  /*
   * PLEASE DO NOT MODIFY THIS METHOD.
   * 
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {

    SimpleDateFormat simpledate = new SimpleDateFormat("dd/MM/yyyy");
    StringBuilder ret = new StringBuilder();

    ret.append(getId()).append(" \t");
    ret.append(getLastName()).append(" \t");
    ret.append(getFirstName()).append(" \t");
    ret.append(simpledate.format(getRegistrationDate())).append(" \t");
    ret.append(getVirusSequence()).append(" \t");
    ret.append("\n");

    return ret.toString();
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((date == null) ? 0 : date.hashCode());
    result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
    result = prime * result + ((sequence == null) ? 0 : sequence.hashCode());
    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof Patient)) {
      return false;
    }
    Patient other = (Patient) obj;
    if (date == null) {
      if (other.date != null) {
        return false;
      }
    } else if (!date.equals(other.date)) {
      return false;
    }
    if (firstname == null) {
      if (other.firstname != null) {
        return false;
      }
    } else if (!firstname.equals(other.firstname)) {
      return false;
    }
    if (id == null) {
      if (other.id != null) {
        return false;
      }
    } else if (!id.equals(other.id)) {
      return false;
    }
    if (lastname == null) {
      if (other.lastname != null) {
        return false;
      }
    } else if (!lastname.equals(other.lastname)) {
      return false;
    }
    if (sequence == null) {
      if (other.sequence != null) {
        return false;
      }
    } else if (!sequence.equals(other.sequence)) {
      return false;
    }
    return true;
  }

}
