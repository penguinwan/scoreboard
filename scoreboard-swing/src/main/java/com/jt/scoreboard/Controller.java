package com.jt.scoreboard;

import com.jt.scoreboard.core.HttpCommunicationManager;
import org.json.JSONObject;

/**
 * Created by superman on 8/7/2015.
 */
public class Controller {
    private HttpCommunicationManager httpMgr = new HttpCommunicationManager();

    public String[] update() {
        String[] scores = new String[2];
        String result = httpMgr.callUpdate();
        JSONObject obj = new JSONObject(result);
        scores[0] = String.valueOf(obj.getInt("left"));
        scores[1] = String.valueOf(obj.getInt("right"));
        return scores;
    }
}

