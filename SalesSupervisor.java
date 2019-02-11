/**Class to represent a supervisor employee who works in sales and is paid in the same manner as sales employees.
  * @author William Turner
  * @version 1.0
 * */

public class SalesSupervisor extends SalesEmployee {
  
  public SalesSupervisor(String firstname, String lastname, String number, double salary, double commission) {
    
    super(firstname, lastname, number, salary, commission); 
    
    this.isasupervisor = true;
    
  }
  
  /** returns a string of the format number: firstname, lastname, Sales Supervisor
    * @return <code>(number + ':' + firstname + ',' + lastname + ", Sales Supervisor")<code>
   */
  public String toString() {
    
    return (this.getNumber() + ": " + this.getLastName() + ", " + this.getFirstName() + ", Sales Supervisor"); 
    
  }
  
}