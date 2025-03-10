package com.trkpo.course.entity;

import javax.persistence.*;

@Entity(name = "Post")
public class Post {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private User user;
    private String text;
    @OneToOne
    private Picture picture;
    private Long dateTime;
    private boolean isPrivate;
    private String spanJson;

    public Post() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public Long getDateTime() {
        return dateTime;
    }

    public void setDateTime(Long dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public String getSpanJson() {
        return spanJson;
    }

    public void setSpanJson(String spanJson) {
        this.spanJson = spanJson;
    }
}
