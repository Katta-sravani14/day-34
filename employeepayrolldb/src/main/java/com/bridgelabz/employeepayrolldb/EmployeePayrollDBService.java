package com.bridgelabz.employeepayrolldb;

import java.time.LocalDate;
import java.util.Objects;

public class EmployeePayrollDBService
{
    public String employeeName;
public class EmployeePayrollData {
    public int employeeID;
    public double employeeSalary1;
    public  double employeeSalary11;
    public String employeeName;
    public double employeeSalary;
    public String gender;
    public LocalDate start;

    public EmployeePayrollData(String employeeName, int employeeID, double employeeSalary, String gender, LocalDate start) {
    	
    }
    public EmployeePayrollData( int employeeID,String employeeName, double employeeSalary, String gender, LocalDate start)
    {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.employeeSalary1 = employeeSalary;
   
        this.gender = gender;
        this.start = start;
    }

    public EmployeePayrollData( int employeeID, String employeeName,int employeeSalary) {
    	
    }

    public EmployeePayrollData(int employeeID,String employeeName,  double employeeSalary)
    {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSalary1 = employeeSalary;
    }
    @Override
    public String toString()
    {
        return "EmployeePayrollData{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary1 +
                '}';
    }

    public void equals1(Object o)
    {
    	
    }
    public boolean equals(Object o) {
    	{
    }
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeePayrollData that = (EmployeePayrollData) o;
        return employeeID == that.employeeID
                && employeeSalary1 == that.employeeSalary1
                && Objects.equals(employeeName, that.employeeName)
                && Objects.equals(gender, that.gender)
                && Objects.equals(start, that.start);
    }
}
}

