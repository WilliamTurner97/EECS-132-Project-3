/** Class to represent an employee who is paid by the hour.
  * @author William Turner
  * @version 1.0
 * */

public class HourlyEmployee extends Employee {
   
  // stores the hourly rate the employee is payed
  double hourlyrate;
  
  // stores the number of hours an employee has worked
  double hoursworked;
  
  double amountearned = (hourlyrate * hoursworked);
  
  public HourlyEmployee(String firstname, String lastname, String number, double hourlyrate) {
    
    this.firstname = firstname;  
    this.lastname = lastname;
    this.number = number;
    this.hourlyrate = hourlyrate;
    this.hoursworked = 0;
  }
  
  /** returns the hourly rate the employee is payed
    * @return <code>hourlyrate<code>
   */
  public double getHourlyRate() {
    
    return hourlyrate; 
  }
  
  /** sets the hourly rate to the double input
    * @ param hourlyrate the double the hourlyrate of the employee will be set to
   */
  public void setHourlyRate(double hourlyrate) {
    
    this.hourlyrate = hourlyrate;   
  }
  
  /** gets the number of hours an employee has worked
    * @return <code>hoursworked<code>
   */
  public double getHoursWorked() {
    
    return hoursworked;   
  }
  
  /** sets the number of hours an employee has worked to the double input
    * @param hoursworked the double that hoursworked will be set to
   */
  public void setHoursWorked(double hoursworked) {
    
    this.hoursworked = hoursworked;    
  }
  
  /** calculates and returns the amount an employee has earned
    * @return <code>amountearned<code>
   */
  public double getAmountEarned() {
    
    amountearned = (hourlyrate * hoursworked);
    return amountearned;
  }
  
  /** adjusts the hourly rate the employee is payed by the given percentage
    * @param percentage the percentage as a double the employee's pay will be modified by
   */
  public void adjustPay(double percentage) {
    
    hourlyrate = (hourlyrate + (hourlyrate * (percentage / 100)));  
  }
  
  /** returns a string of the format number: firstname, lastname, Hourly Employee
    * @ return <code>(number + ':' + firstname + ',' + lastname + ", Hourly Employee")<code>
   */
  public String toString() {
    
    return (this.getNumber() + ": " + this.getLastName() + ", " + this.getFirstName() + ", Hourly Employee"); 
  }
}