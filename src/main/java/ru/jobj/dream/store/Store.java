package ru.jobj.dream.store;

import ru.jobj.dream.model.Post;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Store {

    private static final Store INST = new Store();

    private final Map<Integer, Post> posts = new ConcurrentHashMap<>();

    private Store() {
        posts.put(1, new Post(1, "Junior Java Job", "01.02.2020", "test"));
        posts.put(2, new Post(2, "Middle Java Job", "15.06.2021", "test1"));
        posts.put(3, new Post(3, "Senior Java Job", "15.09.2022", "test2"));
        posts.put(4, new Post(4, "Lead Java Job", "15.12.2022", "test3"));
    }

    public static Store instOf() {
        return INST;
    }

    public Collection<Post> findAll() {
        return posts.values();
    }
}