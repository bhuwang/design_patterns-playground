/**
 * 
 */
package com.bhuwan.designpatterns.creational.prototype.item;

/**
 * @author bhuwan
 *
 */
public class Movie extends Item {

    private String runtime;

    /**
     * @return the runtime
     */
    public String getRuntime() {
        return runtime;
    }

    /**
     * @param runtime
     *            the runtime to set
     */
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Movie [runtime=" + runtime + ", getTitle()=" + getTitle() + ", getPrice()=" + getPrice() + ", getUrl()=" + getUrl() + "]";
    }

}
