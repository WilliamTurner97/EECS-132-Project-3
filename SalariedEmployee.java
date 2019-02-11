/** Class to represent an employee who is payed by salary.
  * @author William Turner
  * @version 1.0
 * */

public class SalariedEmployee extends Employee {
  
  // stores the salary of the employee
  double salary;
  
  public SalariedEmployee(String firstname, String lastname, String number, double salary) {
    
    this.firstname = firstname;
    this.lastname = lastname; 
    this.number = number;
    this.salary = salary;  
  }
  
  /** returns the salary of the employee
    * @return <code>salary<code>
   */
  public double getSalary() {
    
    return salary; 
  }
  
  /** sets the salary of the employee to the double input
    * @param salary the double that the empolyee's salary will be set to
   */
  public void setSalary(double salary) {
    
    this.salary = salary; 
  }
  
  /** returns the amount an employee has earned
    * @return <code>amountearned<code>
   */
  public double getAmountEarned() {
    
    amountearned = (salary + bonus);
    return amountearned;
  }
  
  /** changes the employee's salary by the percentage input
    * @param percentage the percentage the emplyee's salary will be changed by
   */
  public void adjustPay(double percentage) {
    
    salary = (salary + (salary * (percentage / 100)) );   
  }
  
  /** returns a string of the format number: firstname, lastname, Salaried Employee
    * @return <code>(number + ':' + firstname + ',' + lastname + ", Salaried Employee")<code>
   */
  public String toString() {
    
    return (this.getNumber() + ": " + this.getLastName() + ", " + this.getFirstName() + ", Salaried Employee");    
  } 
}