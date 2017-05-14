package TableObjects;

import java.io.Serializable;

/**
 * Created by graphics on 5/1/2017.
 */
public class CommentsObject implements Serializable {
    int thread_id;
    String post;
    int report;
    int up_count;

    public int getReport() {
        return report;
    }

    public void setReport(int report) {
        this.report = report;
    }

    public int getThread_id() {
        return thread_id;
    }

    public void setThread_id(int thread_id) {
        this.thread_id = thread_id;
    }

    public int getUp_count() {
        return up_count;
    }

    public void setUp_count(int up_count) {
        this.up_count = up_count;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPost() {
        return post;
    }
}
