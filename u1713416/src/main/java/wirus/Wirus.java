package wirus;

import java.io.IOException;
import java.text.ParseException;

import patient.PatientArrayList;

/**
 * This is application entry class.
 * 
 * <p>Please note that your code will be tested by an automatic test unit engine that runs each of
 * methods below separately (and outside the main method) and compares your results with
 * those expected.
 * 
 * <p>Visual output is not important, but the values returned by each method below are! You can
 * freely modify
 * this class.
 * see {@link WirusProblemSolutions}
 */
public class Wirus {

  /**
   * @param args
   * @throws IOException
   * @throws ParseException
   */
  public static void main(String[] args) throws IOException, ParseException {

    // You need to have solved Problem 1 first. Solution of Problem 1 does not output any
    // data but is required by the testing suite and for Problems 2-5

    PatientArrayList patients = WirusProblemSolutions.problem2();

    WirusProblemSolutions.problem3a(patients);

    WirusProblemSolutions.problem3c(patients);

    WirusProblemSolutions.problem4(patients);

    WirusProblemSolutions.problem5_1(patients);

    WirusProblemSolutions.problem5_2(patients);
  } // main

}
