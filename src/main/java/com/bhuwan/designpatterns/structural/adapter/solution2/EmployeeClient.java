/**
 * 
 */
package com.bhuwan.designpatterns.structural.adapter.solution2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bhuwan
 *
 */
public class EmployeeClient {

    public List<EmployeeService> getEmployeeList() {
        List<EmployeeService> employees = new ArrayList<>();
        // employee from database
        EmployeeService employeeFromDB = new EmployeeDB("1234", "Bhuwan", "Gautam", "bgpeace01@gmail.com");
        employees.add(employeeFromDB);

        // employee from LDAP
        // This will not gonna work, that's why here comes adapter
        // EmployeeService employeeFromLDAP = new EmployeeLDAP("1234", "Bipen", "Chettri", "bipencheetri@gmail.com");
        EmployeeLDAP employeeFromLDAP = new EmployeeLDAP("6789", "Bipen", "Chettri", "bipencheetri@gmail.com");
        employees.add(new EmployeeAdapterLDAP(employeeFromLDAP));

        // employee from CSV file
        // EmployeeService employeeFromLDAP = new EmployeeLDAP("1234", "Bipen", "Chettri", "bipencheetri@gmail.com");
        EmployeeCSV employeeFromCSV = new EmployeeCSV("3455, Naresh, Maharjan, nareshamaharjan@gmail.com");
        employees.add(new EmployeeAdapterCSV(employeeFromCSV));

        return employees;
    }
}
