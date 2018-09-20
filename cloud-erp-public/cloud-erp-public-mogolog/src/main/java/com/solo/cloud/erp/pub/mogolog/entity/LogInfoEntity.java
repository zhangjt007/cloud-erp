package com.solo.cloud.erp.pub.mogolog.entity;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class LogInfoEntity {
    @Id
    private String id;
    private Date ts;
    private String level;
    private String msg;
    private String thread;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getThread() {
        return thread;
    }

    public void setThread(String thread) {
        this.thread = thread;
    }
}
