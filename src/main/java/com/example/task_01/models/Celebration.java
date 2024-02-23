package com.example.task_01.models;

public class Celebration {

    private String message;
    private String season;

    public Celebration() {}

    public Celebration(String message, String season) {
        this.message = message;
        this.season = season;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}