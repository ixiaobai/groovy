package com.xb.gradle.groovy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Peter on 2018/2/1.
 */
public class TodoRepositoryTest {
    private TodoRepository repository = new TodoRepository();

    @Test
    public void testSave() {
        TodoItem item = new TodoItem("xb");
        repository.save(item);
//        Assert.assertNull(repository.query(item.getName()));
        Assert.assertNotNull(repository.query(item.getName()));
    }
}
