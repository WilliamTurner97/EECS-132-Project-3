/** Class to represent a supervisor employee who is payed by salary. 
 * */

public class SalariedSupervisor extends SalariedEmployee {
  
  public SalariedSupervisor(String firstname, String lastname, String number, double salary) {
    
    super(firstname, lastname, number, salary); 
    this.isasupervisor = true;
  }
 
  /** returns a string of the format number: firstname, lastname, Salaried Supervisor
    * @return <code>(number + ':' + firstname + ',' + lastname + ", Salaried Supervisor")<code>
   */ 
  public String toString() {
    
    return (this.getNumber() + ": " + this.getLastName() + ", " + this.getFirstName() + ", Salaried Supervisor");   
  } 
}