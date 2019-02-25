package patient;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Read data file with patients' records
 * 
 * <p>DO NOT MODIFY
 * 
 * @author Till Bretschneider
 *
 */
public class PatientFile {

  /**
   * Read specified dat file with patients' data.
   * 
   * @param filename file to be read
   * @return List of patients
   * @throws IOException
   * @throws ParseException
   */
  public static PatientArrayList read(String filename) throws IOException, ParseException {

    File file = new File(filename);
    PatientArrayList patients = new PatientArrayList();
    BufferedReader reader = null;

    try {
      reader = Files.newBufferedReader(file.toPath());
      String line = null;

      SimpleDateFormat simpledate = new SimpleDateFormat("dd/MM/yyyy");
      while ((line = reader.readLine()) != null) {

        String delims = "[\t]";
        String[] tokens = line.split(delims);

        Patient patient = new Patient();

        patient.setId(Long.parseLong(tokens[0]));
        patient.setLastName(tokens[1]);
        patient.setFirstName(tokens[2]);
        patient.setRegistrationDate(simpledate.parse(tokens[3]));
        patient.setVirusSequence(tokens[4]);

        patients.add(patient);
      }
    } catch (IOException x) {
      System.err.format("IOException: %s%n", x);
    } finally {
      if (reader != null)
        reader.close();
    }

    patients.toString();

    return patients;

  }

}
