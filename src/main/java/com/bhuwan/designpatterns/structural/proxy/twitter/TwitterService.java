/**
 * 
 */
package com.bhuwan.designpatterns.structural.proxy.twitter;

/**
 * @author bhuwan
 *
 */
public interface TwitterService {

    public String getTimeline(String screenName);

    public void postToTimeline(String screenName, String message);

}
