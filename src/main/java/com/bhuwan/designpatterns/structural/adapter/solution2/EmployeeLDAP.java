/**
 * 
 */
package com.bhuwan.designpatterns.structural.adapter.solution2;

/**
 * @author bhuwan
 *
 */
public class EmployeeLDAP {

    private String cn;
    private String fname;
    private String lname;
    private String mail;

    public EmployeeLDAP(String cn, String fname, String lname, String email) {
        this.cn = cn;
        this.fname = fname;
        this.lname = lname;
        this.mail = email;
    }

    /**
     * @return the cn
     */
    public String getCn() {
        return cn;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return mail;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "EmployeeLDAP [cn=" + cn + ", fname=" + fname + ", lname=" + lname + ", email=" + mail + "]";
    }

}
