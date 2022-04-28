/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.project.ProjectThymeleaf.Model.HR;

import com.fu.project.ProjectThymeleaf.Model.Person;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "Employee")
public class Employee extends Person{
    @ManyToOne
    @JoinColumn(name = "employeeTypeId")
    private EmployeeType employeeTypeID;
    
    @ManyToOne
    @JoinColumn(name = "jobTitleId")
    private JobTitle jobTitle;

    public Employee() {
    }

    public EmployeeType getEmployeeTypeID() {
        return employeeTypeID;
    }

    public void setEmployeeTypeID(EmployeeType employeeTypeID) {
        this.employeeTypeID = employeeTypeID;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }
  
}
