package TableObjects;

import java.io.Serializable;

/**
 * Created by graphics on 5/1/2017.
 */
public class RelatedCourseObject implements Serializable {
    String course_name;
    int course_id;

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_name() {
        return course_name;
    }
}
