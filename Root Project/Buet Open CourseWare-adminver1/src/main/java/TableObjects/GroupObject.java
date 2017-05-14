package TableObjects;

import java.io.Serializable;

/**
 * Created by graphics on 5/1/2017.
 */
public class GroupObject implements Serializable {
    int group_id;
    int user_count;

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int getUser_count() {
        return user_count;
    }

    public void setUser_count(int user_count) {
        this.user_count = user_count;
    }
}
