/** Abstract class to represent the common elements of all employee classes.
  * @author William Turner
  * @version 1.o
 */

public abstract class Employee {
  
  // Stores the first name of the employee
  String firstname;
  
  // Stores the last name of the employee
  String lastname;
  
  // Stores the employee number of the employee
  String number;
  
  // Stores the bonus of the employee
  double bonus;
  
  // Stores the amount an employee has earned
  double amountearned;
  
  // Stores whether or not the employee is a supervisor
  boolean isasupervisor = false;
  
  // Stores the employee's supervisor
  Employee supervisor;
  
  /** returns the first name of the employee.
    * @return <code>firstname<code>
   * */
  public String getFirstName() {
    
    return firstname;  
  }
  
  /** returns the last name of the employee. 
    * @return <code>lastname<code>
   * */
  public String getLastName() {
    
    return lastname;   
  }
  
  /** sets the first and last name of the employee to the Strings input.
    * @param firstname the String to set firstname to
    * @param lastname  the String to set lastname to
   * */
  public void setName(String firstname, String lastname) {
   
    this.firstname = firstname;   
    this.lastname = lastname;
  }  
  
  /** returns the employee number of the employee.
    * @return <code>number<code>
   * */
  public String getNumber() {
    
    return number;    
  }
  
  /** returns the bonus of the employee
    * @return <code>bonus<code>
   * */
  public double getBonus() {
    
    return bonus;   
  }
  
  /** sets the bonus of the employee to the double input
    * @param bonus the value to set the employee's bonus to
   * */
  public void setBonus(double bonus) {
    
    this.bonus = bonus;    
  }
  
  /** determines whether or an employee object is the same as the employee the method is called with
    * @param e the employee to compare with the employee the method is called with
    * @return <code>true<code> if the two employees are the same
    * @return <code>false<code> if the two employeesa are not the same
    */
  public boolean equals(Employee e) {
    
    if (firstname == e.getFirstName() && lastname == e.getLastName() && number == e.getNumber())     
      return true;
    
   else   
     return false;
  }
  
  /** returns the amount earned by an employee.
    * @return <code>amountearned<code>
   * */
  public double getAmountEarned() {
    
    return amountearned;   
  }
  
  /** takes an employee object and returns 0 if it has the same name as the object the method is called with, -1 if it 
    * procedes it in alphabetical order, and 1 if it preceeds it in alphabetical order.
    * @param e employee to be compared with the object the method was called with
    * @return 0 if the names are the same
    * @return -1 if the object name precedes the parameter name alphabetically
    * @return 1 if the object name procedes the parameter name alphabetically
   * */
  public int compareByName(Employee e) {
    
    /* Stores both the first name and last name of the employee object the method is called from concatenated as one
     * string */
    String s1 = this.getFirstName() + this.getLastName();
    
    // Stores both the first name and last name of the parameter employee concatenated as one string
    String s2 = e.getFirstName() + e.getLastName();
    
    // index for the loop below
    int i = 0;
    
    if(s1.equals(s2))
      return 0;
   
    else {
      
      if (s1.equals("") || s2.equals("")) {  
    	  
        if (s1.equals(""))
          return -1;
       
       else
         return 1;    
      }
      
      else {
        
        /* runs through both strings and returns -1 if s1 precedes s2 alphabetically and 1 if s1 procedes s2
         * alphabetically
         * */
        while (i <= s1.length() && i <= s2.length()) {
        
          if ( (i >= s1.length() && i < s2.length()) || (i < s1.length() && i >= s2.length()) )      
            return 0;
         
          else {
           
            if (s1.charAt(i) == s2.charAt(i))
              i++;
        
            else {
            
              if (s1.charAt(i) < s2.charAt(i)) {
              
                i = s1.length() + s2.length() +1;  
                return -1;           
              }
            
              else {
              
                i = s1.length() + s2.length() +1;
                return 1;
              }  
            } 
          }  
        }        
      }
    }  
    return 0;   
  }
  
  /** returns the difference in earnings between two employees.
    * @return <code>this.getAmountEarned() - e.getAmountEarned()<code>
   * */
  public double compareByEarnings(Employee e) {
    
    return (this.getAmountEarned() - e.getAmountEarned());  
  }
  
  /** sets the supervisor of an employee to the employee parameter if the parameter is a supervisor.
    * @param e employee to set to supervisor
   * */
  public void setSupervisor(Employee e) {
    
    if(e.isasupervisor)   
      supervisor = e;  
  }
  
  /** returns the supervisor of an employee
    * @return <code>supervisor<code>
   * */
  public Employee getSupervisor() {
    
    return supervisor; 
  }
  
  /** abstract method, as toString will need to be overidden for each employee class.
   * */
  public abstract String toString(); 
}