/**
 * 
 */
package com.bhuwan.designpatterns.structural.adapter.solution2;

/**
 * @author bhuwan
 *
 */
public class EmployeeAdapterCSV implements EmployeeService {

    private EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.adapter.solution2.EmployeeService#getId()
     */
    @Override
    public String getId() {
        return instance.getId() + "";
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.adapter.solution2.EmployeeService#getFirstName()
     */
    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.adapter.solution2.EmployeeService#getLastName()
     */
    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.adapter.solution2.EmployeeService#getEmail()
     */
    @Override
    public String getEmail() {
        return instance.getEmailaddress();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "EmployeeAdapterCSV [instance=" + instance + "]";
    }

}
