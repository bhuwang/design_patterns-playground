package com.bhuwan.designpatterns.structural.proxy.twitter;

import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/*
 * https://gist.github.com/bh5k/73a82d64e35e780150d1
 */
public class TwitterServiceImpl implements TwitterService {

    private static final String TWITTER_CONSUMER_KEY = "xuvUOI6she0WQ227k7DKdNaQr";
    private static final String TWITTER_SECRET_KEY = "CQa1MtU52nNkQdyw61Yt7CApWj1lL88heTAjazpcQBs9xfxBnV";
    private static final String TWITTER_ACCESS_TOKEN = "112989430-hboxVdjeE65ymu13e7h8fyIs1jtosQ9T4TGgZBw7";
    private static final String TWITTER_ACCESS_TOKEN_SECRET = "UZpHW3AAE1vDUvt9zag5rX8r3G6s1MI6Ebv3h2GFpzSqm";

    @Override
    public String getTimeline(String screenName) {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true).setOAuthConsumerKey(TWITTER_CONSUMER_KEY).setOAuthConsumerSecret(TWITTER_SECRET_KEY)
                .setOAuthAccessToken(TWITTER_ACCESS_TOKEN).setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        StringBuilder builder = new StringBuilder();
        try {
            Query query = new Query(screenName);
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    builder.append("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                    builder.append("\n");
                }
            } while ((query = result.nextQuery()) != null);

        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
        }
        return builder.toString();
    }

    @Override
    public void postToTimeline(String screenName, String message) {
        // we aren't going to allow this
    }
}