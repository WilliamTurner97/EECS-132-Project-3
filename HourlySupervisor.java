/** Class to represent a supervisor employee who is payed by the hour.
  * @author William Turner
  * @version 1.0
 * */

public class HourlySupervisor extends HourlyEmployee {
  
  public HourlySupervisor(String firstname, String lastname, String number, double hourlyrate) {
    
    super(firstname,lastname,number,hourlyrate);  
    this.isasupervisor = true;  
  }
  
  /** returns a string of the format number: firstname, lastname, Hourly Supervisor
    * @return <code>(number + ':' + firstname + ',' + lastname + ", Hourly Supervisor")<code>
   */
  public String toString() {
    
    return (this.getNumber() + ": " + this.getLastName() + ", " + this.getFirstName() + ", Hourly Supervisor");  
  }   
}