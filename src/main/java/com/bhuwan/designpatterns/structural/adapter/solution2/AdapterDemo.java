/**
 * 
 */
package com.bhuwan.designpatterns.structural.adapter.solution2;

import java.util.List;

/**
 * @author bhuwan
 *
 */
public class AdapterDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();
        List<EmployeeService> employees = client.getEmployeeList();
        System.out.println(employees);
    }

}
