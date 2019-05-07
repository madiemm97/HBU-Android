package com.example.csc518;

import java.io.Serializable;

public class MindfulnessObject implements Serializable
{
    public String date;
    public String eat;
    public String family;
    public String whenImDown;

    public MindfulnessObject() {
    }

    public MindfulnessObject(String date, String eat, String family, String whenImDown) {
        this.date = date;
        this.eat = eat;
        this.family = family;
        this.whenImDown = whenImDown;
    }
}
