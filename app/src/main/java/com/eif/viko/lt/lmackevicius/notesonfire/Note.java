package com.eif.viko.lt.lmackevicius.notesonfire;

import com.google.firebase.Timestamp;
import com.google.type.Date;

public class Note {
    String title;
    String content;
    com.google.firebase.Timestamp timestamp;

    public Note() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public com.google.firebase.Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
