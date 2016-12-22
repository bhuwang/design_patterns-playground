/**
 * 
 */
package com.bhuwan.designpatterns.structural.proxy.twitter;

/**
 * @author bhuwan
 *
 */
public class TwitterServiceStub implements TwitterService {

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.proxy.twitter.TwitterService#getTimeline(java.lang.String)
     */
    @Override
    public String getTimeline(String screenName) {
        return "My neato timeline";
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.proxy.twitter.TwitterService#postToTimeline(java.lang.String, java.lang.String)
     */
    @Override
    public void postToTimeline(String screenName, String message) {

    }

}
