/**
 * 
 */
package com.bhuwan.designpatterns.creational.factory.website;

/**
 * @author bhuwan
 *
 */
public class Shop extends Website {

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.creational.factory.website.Website#createWebsite()
     */
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }

}
