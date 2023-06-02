package com.example.HabitTracker;

public class Habit {
    private Long id;
    private String name;
    private String description;

    public Habit() {
    }

    public Habit(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Habit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Habit(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;


    }
}
