package de.neuefische.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Todo findById(String id) {
        return todoRepository.findById(id);
    }

    public Todo create(Todo todo) {
        return todoRepository.create(todo);
    }

    public Todo update(String id, Todo todo) {
        return todoRepository.update(id, todo);
    }

    public void deleteById(String id) {
        todoRepository.deleteById(id);
    }
}
