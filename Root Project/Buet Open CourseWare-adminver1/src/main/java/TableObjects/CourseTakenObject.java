package TableObjects;

import java.io.Serializable;

/**
 * Created by graphics on 4/30/2017.
 */
public class CourseTakenObject implements Serializable {
    int taken_id;
    int user_id;
    String user_name;
    int course_id;

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setTaken_id(int taken_id) {
        this.taken_id = taken_id;
    }

    public int getTaken_id() {
        return taken_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_name() {
        return user_name;
    }
}
