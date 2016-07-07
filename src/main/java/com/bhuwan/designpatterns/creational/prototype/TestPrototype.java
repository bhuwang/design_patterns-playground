/**
 * 
 */
package com.bhuwan.designpatterns.creational.prototype;

import java.util.List;

/**
 * @author bhuwan
 *
 */
public class TestPrototype {

    /**
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee emp = new Employee();
        emp.loadData();

        // Use clone method to get the Employee object.
        Employee emp1 = (Employee) emp.clone();
        List<String> list = emp1.getEmpList();
        list.add("New Member");

        Employee emp2 = (Employee) emp.clone();
        List<String> list2 = emp2.getEmpList();
        list2.remove("Bhuwan");

        System.out.println("Original: ");
        System.out.println(emp.getEmpList());

        System.out.println();
        System.out.println("List1: ");
        System.out.println(list);

        System.out.println();
        System.out.println("List 2: ");
        System.out.println(list2);
    }

}
