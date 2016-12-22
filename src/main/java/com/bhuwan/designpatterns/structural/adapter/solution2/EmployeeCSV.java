/**
 * 
 */
package com.bhuwan.designpatterns.structural.adapter.solution2;

import java.util.StringTokenizer;

/**
 * @author bhuwan
 *
 */
public class EmployeeCSV {

    private int id;
    private String firstname;
    private String lastname;
    private String emailaddress;

    public EmployeeCSV(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if (tokenizer.hasMoreTokens()) {
            id = Integer.valueOf(tokenizer.nextToken().trim());
        }
        if (tokenizer.hasMoreTokens()) {
            firstname = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            lastname = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            emailaddress = tokenizer.nextToken().trim();
        }
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @return the emailaddress
     */
    public String getEmailaddress() {
        return emailaddress;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "EmployeeCSV [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", emailaddress=" + emailaddress + "]";
    }
}
