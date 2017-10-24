import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    WebDriver browser;

    /**
     * Login into given account using current session.
     *
     * @param login    user Facebook login
     * @param password user Facebook password
     */
    public void logIn(String login, String password) {
    }

    /**
     * Checks if the user in current session is logged in.
     */
    public boolean isLoggedIn() {
        return true;
    }

    /**
     * Get facebook user's friends list by facebook user id.
     *
     * @param id facebook user id
     * @return array of user's friend's ids in a list
     */
    public List<String> getFriendsById(String id) {
        return new ArrayList<String>();
    }

    /**
     * Get facebook user's about information
     *
     * @param id facebook user id
     * @return json of all given information
     */
    public JSONObject getAboutById(String id) {
        return new JSONObject();
    }

    /**
     * Get post json by post's url
     *
     * @param url url of the post
     * @return all info from the post as JSON object
     */
    public JSONObject getPostByUrl(String url) {

    }

    /**
     * Get last n user's posts by given url
     *
     * @param n the number of posts to be scraped
     * @return last n user's posts as array of json objects
     */
    public JSONArray getUserPosts(Integer n) {

    }
}
