package ru.jobj.dream.store;

import ru.jobj.dream.model.Post;
import ru.jobj.dream.model.Candidate;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Store {

    private static final Store INST = new Store();

    private static AtomicInteger POST_ID = new AtomicInteger(4);

    private Map<Integer, Post> posts = new ConcurrentHashMap<>();

    private Map<Integer, Candidate> candidates = new ConcurrentHashMap<>();

    private Store() {
        posts.put(1, new Post(1, "Junior Java Job", "01.02.2020", "test"));
        posts.put(2, new Post(2, "Middle Java Job", "15.06.2021", "test1"));
        posts.put(3, new Post(3, "Senior Java Job", "15.09.2022", "test2"));
        posts.put(4, new Post(4, "Lead Java Job", "15.12.2022", "test3"));
        candidates.put(1, new Candidate(1, "Junior Java"));
        candidates.put(2, new Candidate(2, "Middle Java"));
        candidates.put(3, new Candidate(3, "Senior Java"));
    }

    public static Store instOf() {
        return INST;
    }

    public Collection<Post> findAllPosts() {
        return posts.values();
    }

    public Collection<Candidate> findAllCandidates() {
        return candidates.values();
    }

    public void save(Post post) {
        post.setId(POST_ID.incrementAndGet());
        posts.put(post.getId(), post);
    }
}