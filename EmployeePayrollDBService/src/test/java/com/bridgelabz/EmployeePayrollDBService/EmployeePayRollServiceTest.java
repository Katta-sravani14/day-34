package com.bridgelabz.EmployeePayrollDBService;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class EmployeePayRollServiceTest
{

    @Test
    void given3EmpWhenWrittenToFilesShouldMatchEmpEntries()
    {
        EmployeePayrollData[] arrayOfEmp= {
                new EmployeePayrollData(1,"Sanket",1235),
                new EmployeePayrollData(2,"Bill",1235),
                new EmployeePayrollData(3,"Mark",1235),
        };
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmp));
        employeePayrollService.empWriteData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
        long result = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        System.out.println("Total Employee Entries :- "+result);
        Assert.assertEquals(3,result);


    }

    @Test
    public void givenEmployeePayrollDB_WhenRetrieved_ShouldMatchEmpCount() {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        List<EmployeePayrollData> employeePayrollData = employeePayrollService.readEmployeePayRollData(EmployeePayrollService.IOService.DB_IO);
        System.out.println(employeePayrollData);
        Assert.assertEquals(6, employeePayrollData.size());
    }
}