package com.bhuwan.designpatterns.creational.prototype.item;

public class Book extends Item {

    private int noOfPages;

    /**
     * @return the noOfPages
     */
    public int getNoOfPages() {
        return noOfPages;
    }

    /**
     * @param noOfPages
     *            the noOfPages to set
     */
    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Book [noOfPages=" + noOfPages + ", getTitle()=" + getTitle() + ", getPrice()=" + getPrice() + ", getUrl()=" + getUrl()
                + "]";
    }

}
