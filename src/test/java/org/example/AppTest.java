package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase {
  /**
   * Create the test case.
   *
   * @param testName name of the test case
   */
  public AppTest(final String testName) {
    super(testName);
  }

  /**
   * Returns a test suite containing all test cases from the AppTest class.
   *
   * @return the suite of tests being tested.
   */
  public static Test suite() {
    return new TestSuite(AppTest.class);
  }
}