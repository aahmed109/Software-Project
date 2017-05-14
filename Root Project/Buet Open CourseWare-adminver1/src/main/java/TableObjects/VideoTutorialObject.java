package TableObjects;

import java.io.Serializable;

/**
 * Created by graphics on 5/1/2017.
 */
public class VideoTutorialObject implements Serializable {
    String title;
    String link;
    int course_id;

    public int getCourse_id() {
        return course_id;
    }

    public String getLink() {
        return link;
    }

    public String getTitle() {
        return title;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
