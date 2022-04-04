package ru.jobj.dream.model;

import jdk.jfr.Timestamp;

import java.util.Objects;

public class Post {
    private int id;
    private String name;
    private String description;
    private String created;

    public Post(int id, String name, String created, String description) {
        this.id = id;
        this.name = name;
        this.created = created;
        this.description = description;
    }

    public String getCreated() {
        return created;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id == post.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
