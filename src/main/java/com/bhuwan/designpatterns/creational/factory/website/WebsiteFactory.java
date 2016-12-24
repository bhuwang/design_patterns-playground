/**
 * 
 */
package com.bhuwan.designpatterns.creational.factory.website;

/**
 * @author bhuwan
 *
 */
public class WebsiteFactory {

    public static Website getWebsite(SiteType type) {
        switch (type) {
        case BLOG:
            return new Blog();
        case SHOP:
            return new Shop();
        default:
            return null;
        }
    }
}
