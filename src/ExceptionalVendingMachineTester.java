// TODO Add File header here

// TODO import relevant exceptions here

/**
 * This class implements testers to check the correctness of the methods implemented in p04
 * Exceptional Vending Machine
 *
 */
public class ExceptionalVendingMachineTester {
  // TODO complete the implementation of all the public static tester methods defined below

  // It is recommended but NOT required to add additional tester methods to check the correctness
  // of loadItems and saveVendingMachineSumary defined in the ExceptionalVendingMachine class.

  /**
   * Checks the correctness of the constructor of the class Item when passed invalid inputs
   * 
   * @return true if the test verifies a correct functionality and false if any bug is detected
   */
  public static boolean testItemConstructorNotValidInput() {
    return false;
  }

  /**
   * Checks the correctness of the constructor of the class Item, Item.getDescription(),
   * Item.getExpirationDate(), Item.setDescription(), and Item.toString() when passed valid inputs
   * 
   * @return true if the test verifies a correct functionality and false if any bug is detected
   */
  public static boolean testItemConstructorGettersSetters() {
    return false; // default return statement added to resolve compiler errors
  }

  /**
   * Checks the correctness of the Item.equals() method. You should consider at least the following
   * four scenarios. (1) Create an item with valid description and expiration date, comparing it to
   * itself should return true. (2) Two items having the same description but different expiration
   * dates should be equal. (3) Passing a null reference to the Item.equals() method should return
   * false. (4) An item MUST NOT be equal to an object NOT instance of the class Item, for instance
   * a string object.
   * 
   * @return true if the test verifies a correct functionality and false if any bug is detected
   */
  public static boolean testItemEquals() {
    return false; // default return statement added to resolve compiler errors
  }


  /**
   * Checks the correctness of the constructor of the ExceptionalVendingMachine when passed invalid
   * input
   * 
   * @return true if the test verifies a correct functionality and false if any bug is detected
   */
  public static boolean testExceptionalVendingMachineConstructor() {
    return false; // default return statement added to resolve compiler errors
  }

  /**
   * Checks the correctness of the following methods defined in the ExceptionalVendingMachine class
   * when an exception is expected to be thrown:
   * 
   * addItem(), containsItem(), getIndexNextItem(), getItemAtIndex(), getItemOccurrences(),
   * getItemOccurrencesByExpirationDate(), removeNextItem().
   * 
   * @return true if the test verifies a correct functionality and false if any bug is detected
   */
  public static boolean testExceptionalVendingMachineAddContainsRemoveGetters() {
    return false; // default return statement added to resolve compiler errors
  }

  /**
   * Checks the correctness of isEmpty(), size(), and isFull() methods defined in the
   * ExceptionalVendingMachine class
   * 
   * @return true if the test verifies a correct functionality and false if any bug is detected
   */
  public static boolean testEmptySizeFullExceptionalVendingMachine() {
    return false; // default return statement added to resolve compiler errors
  }

  /**
   * Checks the correctness of loadOneItem method with respect to its specification. Consider at
   * least the four following scenarios. (1) Successful scenario for loading one item with a valid
   * string representation to a non-full vending machine. (2) Unsuccessful scenario for passing null
   * or a blank string (for instance one space or empty string) to the loadOneItem() method call, an
   * IllegalArgumentEXception is expected to be thrown. (3) Unsuccessful scenario for passing a
   * badly formatted string to the loadOneItem method. A DataFormatException is expected to be
   * thrown. (4) Unsuccessful scenario for trying to load an item with a valid representation to a
   * full vending machine. An IllegalStateException is expected to be thrown.
   * 
   * @return true if the test verifies a correct functionality and false if any bug is detected
   */
  public static boolean testLoadOneItem() {
    return false; // default return statement added to resolve compiler errors
  }

  /**
   * Invokes all the public tester methods implemented in this class
   * 
   * @return true if all testers pass with no errors, and false if any of the tester fails.
   */
  public static boolean runAllTests() {
    return false; // default return statement added to resolve compiler errors
  }

  /**
   * Main method for the tester class
   * 
   * @param args list of input arguments if any
   */
  public static void main(String[] args) {

  }

}
