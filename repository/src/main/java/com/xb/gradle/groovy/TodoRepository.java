package com.xb.gradle.groovy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Peter on 2018/2/1.
 */
public class TodoRepository {
    private static Map<String,TodoItem> items = new HashMap<String,TodoItem>();

    public void save(TodoItem item) {
        System.out.println("" + item);
        items.put(item.getName(),item);
    }

    public Object query(String name) {
        return items.get(name);
    }
}
