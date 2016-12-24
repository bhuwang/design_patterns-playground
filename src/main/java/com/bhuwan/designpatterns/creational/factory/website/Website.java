/**
 * 
 */
package com.bhuwan.designpatterns.creational.factory.website;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bhuwan
 *
 */
public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public abstract void createWebsite();

    public List<Page> getPages() {
        return pages;
    }
}
