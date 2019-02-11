/** Class to represent an employee who works in sales and is payed salary plus commission.
  * @author William Turner
  * @version 1.0
 * */

public class SalesEmployee extends SalariedEmployee {
  
  // the commission for the employee
  double commission;
  
  // the number of sales the employee has facilitated
  int numsales = 0;
  
  public SalesEmployee(String firstname, String lastname, String number, double salary, double commission) {
    
    super(firstname, lastname, number, salary); 
    
    this.commission = commission;
   
  }
  
  /** returns the commission for the employee
    * @return <code>commission<code>
   */
  public double getCommission() {
    
    return commission; 
    
  }
  
  /** sets the commission of the employee to the double input
    * @param commission the double to set the employee's commission to
   */
  public void setCommission(double commission) {
    
    this.commission = commission; 
    
  }
  
  /** returns the number of sales an employee has facilitated
    * @return <code>numsales<code>
   */
  public int getNumSales() {
    
    return numsales; 
    
  }
  
  /** sets the number of sales to the int input
    * @param numsales the int to set the number of sales to
   */
  public void setNumSales(int numsales) {
    
    this.numsales = numsales; 
    
  }
  
  /** returns the amount an employee has earned
    * @return <code>amountearned<code>
   */
  public double getAmountEarned() {
    
    amountearned = (salary + (commission * numsales));
   
    return amountearned;
    
  }
  
  /** changes the commission of the employee by the percentage input
    * @param percentage the percentage by which the commission will be altered
   */
  public void adjustPay(double percentage) {
    
    commission = (commission + (commission * (percentage/100)) );
    
  }
  
  /** returns a string of the format number: firstname, lastname, Sales Employee
    * @return <code>(number + ':' + firstname + ',' + lastname + ", Sales Employee")<code>
   */
  public String toString() {
    
    return (this.getNumber() + ": " +  this.getLastName() + ", " + this.getFirstName() + ", Sales Employee"); 
    
  }
  
}