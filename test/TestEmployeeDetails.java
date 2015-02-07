/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import javaapplication1.EmpBusinessLogic;
import javaapplication1.EmployeeDetails;
import org.testng.annotations.Test;
import org.testng.Assert;


/**
 *
 * @author 20
 */
public class TestEmployeeDetails {
   EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
   EmployeeDetails employee = new EmployeeDetails();

   @Test
   public void testCalculateAppriasal() {
   
      employee.setName("Rajeev");
      employee.setAge(25);
      employee.setMonthlySalary(8000);
      
      double appraisal = empBusinessLogic.calculateAppraisal(employee);
      Assert.assertEquals(500, appraisal, 0.0, "500");
   }

   // Test to check yearly salary
   @Test
   public void testCalculateYearlySalary() {
   
      employee.setName("Rajeev");
      employee.setAge(25);
      employee.setMonthlySalary(8000);
      
      double salary = empBusinessLogic.calculateYearlySalary(employee);
      Assert.assertEquals(96000, salary, 0.0, "8000");
   }
}