package com.jt.scoreboard;

import com.jt.scoreboard.core.StorageManager;
import com.jt.scoreboard.api.Score;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: superman
 * Date: 6/28/15
 * Time: 5:28 PM
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class ScoreController {
    private StorageManager storageManager = new StorageManager();

    @RequestMapping("/update")
    public Score update() {
        return storageManager.readLatest();
    }
}
