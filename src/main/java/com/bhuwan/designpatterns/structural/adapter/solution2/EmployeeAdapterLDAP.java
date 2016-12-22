/**
 * 
 */
package com.bhuwan.designpatterns.structural.adapter.solution2;

/**
 * @author bhuwan
 *
 */
public class EmployeeAdapterLDAP implements EmployeeService {

    private EmployeeLDAP instance;

    public EmployeeAdapterLDAP(EmployeeLDAP instance) {
        this.instance = instance;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.adapter.solution2.EmployeeService#getId()
     */
    @Override
    public String getId() {
        return instance.getCn();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.adapter.solution2.EmployeeService#getFirstName()
     */
    @Override
    public String getFirstName() {
        return instance.getFname();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.adapter.solution2.EmployeeService#getLastName()
     */
    @Override
    public String getLastName() {
        return instance.getLname();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.adapter.solution2.EmployeeService#getEmail()
     */
    @Override
    public String getEmail() {
        return instance.getEmail();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "EmployeeAdapterLDAP [instance=" + instance + "]";
    }

}
