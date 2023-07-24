package de.neuefische.backend;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class TodoRepository {
    private List<Todo> todos = new ArrayList<>();

    public List<Todo> findAll() {
        return todos;
    }

    public Todo findById(String id) {
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).getId().equals(id)) {
                return todos.get(i);
            }
        }

        return null;
    }

    public Todo create(Todo todo) {
        todo.setId(UUID.randomUUID().toString());
        todos.add(todo);
        return todo;
    }

    public Todo update(String id, Todo todo) {
        todo.setId(id);

        Todo updated = null;
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).getId().equals(id)) {
                todos.set(i, todo);
                updated = todo;
            }
        }

        return updated;
    }

    public void deleteById(String id) {
        for (int i = 0; i < todos.size(); i++) {
            if (todos.get(i).getId().equals(id)) {
                todos.remove(i);
                break;
            }
        }
    }
}
