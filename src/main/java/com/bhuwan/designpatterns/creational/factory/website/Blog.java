/**
 * 
 */
package com.bhuwan.designpatterns.creational.factory.website;

/**
 * @author bhuwan
 *
 */
public class Blog extends Website {

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.creational.factory.website.Website#createWebsite()
     */
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }

}
