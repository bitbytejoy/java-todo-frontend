package de.neuefische.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @GetMapping
    public List<Todo> findAll() {
        return todoService.findAll();
    }

    @GetMapping("/{id}")
    public Todo findById(@PathVariable String id) {
        return todoService.findById(id);
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return todoService.create(todo);
    }

    @PutMapping("/{id}")
    public Todo update(@PathVariable String id, @RequestBody Todo todo) {
        return todoService.update(id, todo);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        todoService.deleteById(id);
    }
}
