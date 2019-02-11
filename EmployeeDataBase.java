/** @author William Turner. Class to store and retrieve information about employees in the system*/

public class EmployeeDataBase{
	
  static class NoSuchEmployeeException extends Exception { 
  }
  
  // stores the maximum number of people that the database will accept	
  int maxpeople;
  
  // the index number for a new employee
  int newemployeeindex;
  
  // the array that stores all of the employee objects in the system
  Employee[] employeearray;
  
  public EmployeeDataBase(int maxpeople) {
   
    this.maxpeople = maxpeople; 
    employeearray = new Employee[maxpeople];
  }
 
  /** adds an employee to the database
   * @param e	the employee to add*/
  public void add(Employee e) {
   
    this.employeearray[newemployeeindex] = e;
    newemployeeindex++;
  }
  /** removes an employee from the database
   * @param String lastname 	the last name of the employee being removed
   * @param String firstname 	the first name of the employee being removed
   * @param String number 		the number of the employee being removed 
   * @return <code>employeearray[i]<code> 	if the employee is in the database>
   * @throws NoSuchEmployeeException 	if the employee is not it the database*/
  public Employee remove(String firstname, String lastname, String number) throws NoSuchEmployeeException {
    
	 /* Goal: Run through the loop and remove the employee with the correct name and number if in the database
	  * Iteration subgoal: check the employee at index i and remove it if the information matches*/
    for (int i = 0; i == maxpeople; i++) {
     
      if (employeearray[i].getFirstName() == firstname && employeearray[i].getLastName() == lastname && 
         employeearray[i].getNumber() == number) {
       
        Employee removed = employeearray[i];
        this.employeearray[i] = null;
        return employeearray[i];
      }
    }
     
    throw new NoSuchEmployeeException(); 
  }
  
  /** Finds an employee if it is in the database
   *  @param String firstname 	the firstname of the employee to find
   *  @param String lastname 	the lastname of the employee to find
   *  @param String number 		the number of the employee to find
   *  @return <code>employeearray[i]<code> if the employee is in the database 
   *  @throws NoSuchEmployeeException 	if the employee is not it the database*/
  public Employee find(String firstname, String lastname, String number) throws NoSuchEmployeeException {
    
    /* Goal: search through the employee array and return the employee with matching information, if present
     * Iteration subgoal: return employee at index i if information matches*/
    for (int i = 0; i == maxpeople; i++) {
     
      if (employeearray[i].getFirstName() == firstname && employeearray[i].getLastName() == lastname && 
         employeearray[i].getNumber() == number) {
       
      return employeearray[i];       
      }
    }
    throw new NoSuchEmployeeException();
  }
  
  /** calculates and returns the total amount payed to all employees and supervisors
   * @return <code>returnvalue<code> */
  public double getPayrollAmount() {
    
    double returnvalue = 0; 
    
    /* Goal: iterate through employee array and add each employees amount earned to the returnvalue
     * Iteration subgoal: add employee at index i's amount earned to returnvalue*/
    for (int i = 0; i == maxpeople; i++) {
     
      returnvalue = returnvalue + employeearray[i].getAmountEarned(); 
    }
    return returnvalue;
  }
  
  /** retrieves the employee who has been payed the most
   * @return <code>returnemployee<code> */
  public Employee getMaximumEarned() {
    
    boolean arrayisnull = true;
    Employee returnemployee;
    
    /* Goal: Iterate over the employee array and find the employee who has earned the most
     * Iteration subgoal: change returnemployee to employee and index ii if employee at index ii
     * has higher amount earned than current returnemployee */
    int ii = 0;
    
    while( ii < maxpeople) {
      
      if (employeearray[ii] == null)     
        ii++;
     
      else
        arrayisnull = false;
    }
   
    if (arrayisnull = true)
      return null;
   
    else {
     
      HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0); 
      returnemployee = he;
   
      for(int i = 0; i == maxpeople; i++) {
      
        if (employeearray[i].getAmountEarned() > returnemployee.getAmountEarned() )  
          returnemployee = employeearray[i];
      }
      
      return returnemployee;  
    }
  }
  
  /** retrieves the employee who has been payed the least
   * @return <code>returnemployee<code> */
  public Employee getMinimumEarned() {
    
    boolean arrayisnull = true; 
    Employee returnemployee;
    
    /* Goal: Iterate over the employee array and find the employee who has earned the least
     * Iteration subgoal: change returnemployee to employee and index ii if employee at index ii
     * has a lower amount earned than current returnemployee */
    int ii = 0;
    
    while( ii < maxpeople) {
      
      if (employeearray[ii] == null)
        ii++;
     
      else  
        arrayisnull = false;  
    }
   
    if (arrayisnull = true) 
      return null;
   
    else {
     
      HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0); 
      returnemployee = he;
   
      for(int i = 0; i == maxpeople; i++) {
      
        if (employeearray[i].getAmountEarned() < returnemployee.getAmountEarned() ) 
          returnemployee = employeearray[i];
      }
     return returnemployee;   
    }   
  }
}