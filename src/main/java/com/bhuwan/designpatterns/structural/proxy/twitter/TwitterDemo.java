/**
 * 
 */
package com.bhuwan.designpatterns.structural.proxy.twitter;

/**
 * @author bhuwan
 *
 */
public class TwitterDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TwitterService twitterService = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());
        System.out.println(twitterService.getTimeline("bhk5"));
    }

}
