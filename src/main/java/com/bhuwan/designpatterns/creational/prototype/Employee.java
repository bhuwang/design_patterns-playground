/**
 * 
 */
package com.bhuwan.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bhuwan
 *
 */
public class Employee implements Cloneable {

    private List<String> employees;

    public Employee() {
        employees = new ArrayList<String>();
    }

    public Employee(List<String> empList) {
        this.employees = empList;
    }

    public void loadData() {
        /*
         * This method will read the data from the database and load into this variable.
         */
        employees.add("Bhuwan");
        employees.add("Bipen");
        employees.add("Naresh");
        employees.add("Pratik");
    }

    public List<String> getEmpList() {
        return employees;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> clone = new ArrayList<String>();
        employees.forEach(clone::add);
        return new Employee(clone);
    }

}
