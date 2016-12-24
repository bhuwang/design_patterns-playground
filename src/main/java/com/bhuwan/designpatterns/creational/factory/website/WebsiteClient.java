/**
 * 
 */
package com.bhuwan.designpatterns.creational.factory.website;

/**
 * @author bhuwan
 *
 */
public class WebsiteClient {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Website blog = WebsiteFactory.getWebsite(SiteType.BLOG);
        System.out.println(blog.getPages());

        Website shop = WebsiteFactory.getWebsite(SiteType.SHOP);
        System.out.println(shop.getPages());
    }

}
