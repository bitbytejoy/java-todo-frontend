package de.neuefische.backend;

import lombok.Data;

@Data
public class Todo {
    private String id;
    private String description;
    private String status;
}
