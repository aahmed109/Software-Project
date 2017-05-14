package TableObjects;

import java.io.Serializable;

/**
 * Created by graphics on 5/1/2017.
 */
public class ThreadsObject implements Serializable {
    int group_id;
    int thread_id;
    String starter;
    String post;
    int report;
    int upcount;

    public void setThread_id(int thread_id) {
        this.thread_id = thread_id;
    }

    public int getThread_id() {
        return thread_id;
    }

    public void setReport(int report) {
        this.report = report;
    }

    public int getReport() {
        return report;
    }

    public int getGroup_id() {
        return group_id;
    }

    public int getUpcount() {
        return upcount;
    }

    public String getPost() {
        return post;
    }

    public String getStarter() {
        return starter;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setStarter(String starter) {
        this.starter = starter;
    }

    public void setUpcount(int upcount) {
        this.upcount = upcount;
    }
}
