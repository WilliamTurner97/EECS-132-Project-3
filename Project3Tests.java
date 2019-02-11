import junit.framework.TestCase;

public class Project3Tests extends TestCase {
  
  static class NoSuchEmployeeException extends Exception { 
  }
  
  // Employee tests
  
  public void testGetFirstName() {
    
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0); 
    
    assertTrue("wrong first name", he.getFirstName() == "John" );  
  }
  
  public void testGetLastName() {
    
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0);  
   
    assertTrue("wrong last name", he.getLastName() == "Smith");
  }
  
  public void testSetName() {
    
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0); 
    he.setName("McLovin", "Supreme");
   
    assertTrue("set the wrong name", (he.getFirstName() == "McLovin" && he.getLastName() == "Supreme") ); 
  }
  
  public void testGetNumber() {
    
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0); 
   
    assertTrue("wrong number", he.getNumber() == "12345");
  }
  
  public void testGetBonus() {
    
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0); 
   
    assertTrue("bonus is incorrect", he.getBonus() == 0.0);
  }
  
  public void testSetBonus() {
    
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0);  
    he.setBonus(5.0);
   
    assertTrue("method didn't work", he.getBonus() == 5.0);   
  }
  
  public void testEquals() {
  
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0);  
    HourlyEmployee alsohe = new HourlyEmployee("John", "Smith", "12345", 10.0); 
    HourlyEmployee nothe1 = new HourlyEmployee("Calvin", "Smith", "12345", 10.0);   
    HourlyEmployee nothe2 = new HourlyEmployee("John", "Silver", "12345", 10.0);  
    HourlyEmployee nothe3 = new HourlyEmployee("John", "Smith", "67890", 10.0);
    
    assertTrue("should be the same", he.equals(alsohe) );
    assertFalse("equals method broken case 1", he.equals(nothe1) );
    assertFalse("equals method broken case 2", he.equals(nothe2) );
    assertFalse("equals method broken case 3", he.equals(nothe3) );
  }
  
  public void testGetAmountEarned() {
    
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0); 
   
    assertTrue("wrong amount", he.getAmountEarned() == 0.0);
  }
  
  public void testCompareByName() {
    
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0);    
    HourlyEmployee alsohe = new HourlyEmployee("John", "Smith", "12345", 10.0);    
    HourlyEmployee blankname = new HourlyEmployee("", "", "12345", 10.0);     
    HourlyEmployee beforehe = new HourlyEmployee("Alex", "Smith", "12345", 10.0);  
    HourlyEmployee afterhe = new HourlyEmployee("Zebediah", "Smith", "12345", 10.0);  
    HourlyEmployee helonger = new HourlyEmployee("John", "Smithtonson", "12345", 10.0); 
    HourlyEmployee looptestlength1 = new HourlyEmployee("J", "", "12345", 10.0);  
   
    assertTrue("alsohe test failed", he.compareByName(alsohe) == 0 );
    assertTrue("blankname test 1 failed", he.compareByName(blankname) == 1);
    assertTrue("blankname test 2 failed", blankname.compareByName(he) == -1);
    assertTrue("beforehe test failed", he.compareByName(beforehe) == 1);
    assertTrue("afterhe test failed", he.compareByName(afterhe) == -1);
    assertTrue("helonger test failed", he.compareByName(helonger) == 0); 
    assertTrue("looptestlength1 test failed", he.compareByName(looptestlength1) == 0); 
  }
  
  public void testCompareByEarnings() {
    
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0);
    he.setHoursWorked(1.0);
    HourlyEmployee he2 = new HourlyEmployee("John", "Smith", "12345", 10.0);  
    he2.setHoursWorked(2.0); 
   
    assertTrue("compareByEarnings test failed", he.compareByEarnings(he2) == -10.0); 
  }
  
  public void testSetSupervisor() {
    
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0);    
    HourlyEmployee he2 = new HourlyEmployee("Peter", "Parker", "33333", 10.0);  
    HourlySupervisor hs = new HourlySupervisor("Tony", "Stark", "44444", 10.0);  
    he.setSupervisor(he2);
   
    assertFalse("shouldn't have been able to set he2 as supervisor", he.getSupervisor() == he2); 
      he.setSupervisor(hs); 
    assertTrue("should have set hs as supervisor", he.getSupervisor() == hs);
  }
  
  public void testGetSupervisor() {
    
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0);  
    HourlySupervisor hs = new HourlySupervisor("Tony", "Stark", "44444", 10.0);    
    he.setSupervisor(hs);
   
    assertTrue("supervisor be hs", he.getSupervisor() == hs); 
  }
  
  // Hourly Employee tests
  
  public void testGetHourlyRate() {
    
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0); 
    
    assertTrue("getHourlyRate test failed", he.getHourlyRate() == 10.0);
  }
  
  public void testSetHourlyRate() {
    
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0);  
    he.setHourlyRate(20.0);
   
    assertTrue("setHourlyRate test failed", he.getHourlyRate() == 20.0);
  }
  
  public void testGetHoursWorked() {
    
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0); 
   
    assertTrue("getHoursWorked test failed", he.getHoursWorked() == 0);  
  }
  
  public void testSetHoursWorked() {
    
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0); 
    he.setHoursWorked(10.0);
   
    assertTrue("setHoursWorked test failed", he.getHoursWorked() == 10.0);
  }
  
  public void testGetAmountEarnedHourlyEmployee() {
    
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0); 
    he.setHoursWorked(5.0);
   
    assertTrue("getAmountEarned test failed", he.getAmountEarned() == 50.0);  
  }
  
  public void testAdjustPayHourlyEmployee() {
    
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0); 
    he.adjustPay(10.0);
   
    assertTrue("adjustPay test failed", he.getHourlyRate() == 11.0);
  }
  
  public void testToStringHourlyEmployee() {
    
    HourlyEmployee he = new HourlyEmployee("John", "Smith", "12345", 10.0); 
    
    assertTrue("toString test failed", he.toString().equals("12345: Smith, John, Hourly Employee") );  
  }
  
  // Hourly Supervisor tests
 
  public void testToStringHourlySupervisor() {
    
    HourlySupervisor hs = new HourlySupervisor("John", "Smith", "12345", 10.0); 
    
    assertTrue("toString test failed", hs.toString().equals("12345: Smith, John, Hourly Supervisor") );    
  } 
  
  // Salaried Employee tests
  
  public void testGetSalarySalariedEmployee() {
    
    SalariedEmployee se = new SalariedEmployee("John", "Smith", "12345", 50000.0);
    
    assertTrue("getSalary test failed", se.getSalary() == 50000.0);  
  }

  
  public void testSetSalarySalariedEmployee() {
    
    SalariedEmployee se = new SalariedEmployee("John", "Smith", "12345", 50000.0);
    se.setSalary(60000.0);
   
    assertTrue("setSalary test failed", se.getSalary() == 60000.0);  
  }
  
  public void testGetAmountEarnedSalariedEmployee() {
    
    SalariedEmployee se = new SalariedEmployee("John", "Smith", "12345", 50000.0);
    se.setBonus(5000.0);
   
    assertTrue("getAmountEarnedSalariedEmployee test failed", se.getAmountEarned() == 55000.0);
  }
  
  public void testAdjustPaySalariedEmployee() {
    
    SalariedEmployee se = new SalariedEmployee("John", "Smith", "12345", 50000.0);
    se.adjustPay(10.0);
   
    assertTrue("adjustPay test Failed", se.getSalary() == 55000.0);  
  }
  
  public void testToStringSalariedEmployee() {
    
    SalariedEmployee se = new SalariedEmployee("John", "Smith", "12345", 50000.0);
   
    assertTrue("toString test failed", se.toString().equals("12345: Smith, John, Salaried Employee") );
  }
  
  // Salaried Supervisor tests
  
  public void testToStringSalariedSupervisor() {
    
    SalariedSupervisor ss = new SalariedSupervisor("John", "Smith", "12345", 50000.0);
   
    assertTrue("toString test failed", ss.toString().equals("12345: Smith, John, Salaried Supervisor") );
  } 
  
  // Sales Employee tests

  public void testGetCommission() {
    
    SalesEmployee slse = new SalesEmployee("John", "Smith", "12345", 20000.0, 100.0); 
   
    assertTrue("getCommission test failed", slse.getCommission() == 100.0);
  }
  
  public void testSetCommission() {
    
    SalesEmployee slse = new SalesEmployee("John", "Smith", "12345", 20000.0, 100.0);
    slse.setCommission(200.0);
   
    assertTrue("setCommission test failed", slse.getCommission() == 200.0 ); 
  }
  
  public void testGetNumSales() {
    
    SalesEmployee slse = new SalesEmployee("John", "Smith", "12345", 20000.0, 100.0);
   
    assertTrue("getNumSales test failed", slse.getNumSales() == 0);
  }
  
  public void testSetNumSales() {
    
    SalesEmployee slse = new SalesEmployee("John", "Smith", "12345", 20000.0, 100.0);
    slse.setNumSales(10);
   
    assertTrue("setNumSales test failed", slse.getNumSales() == 10);
  }
  
  public void testGetAmountEarnedSalesEmployee() {
    
    SalesEmployee slse = new SalesEmployee("John", "Smith", "12345", 20000.0, 100.0);
    slse.setNumSales(100);
   
    assertTrue("getAmountEarned test failed", slse.getAmountEarned() == 30000.0);
  }
  
  public void testAdjustPaySalesEmployee() {
    
    SalesEmployee slse = new SalesEmployee("John", "Smith", "12345", 20000.0, 100.0);
    slse.adjustPay(-10.0);
    
    assertTrue("adjustPay test failed", slse.getCommission() == 90.0);
  }
  
  public void testToStringSalesEmployee() {
    
    SalesEmployee slse = new SalesEmployee("John", "Smith", "12345", 20000.0, 100.0);
   
    assertTrue("toString test failed", slse.toString().equals("12345: Smith, John, Sales Employee") );
  }
  
  // Sales Supervisor tests
  
  public void testToStringSalesSupervisor() {
    
    SalesSupervisor slssup = new SalesSupervisor("John", "Smith", "12345", 20000.0, 100.0);
   
    assertTrue("toString test failed", slssup.toString().equals("12345: Smith, John, Sales Supervisor") );
  }
}