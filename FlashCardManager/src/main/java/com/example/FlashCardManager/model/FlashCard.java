package com.example.FlashCardManager.model;

public class FlashCard {
    private String id;
    private String title;

    // Constructors
    public FlashCard(String id, String title) {
        this.id = id;
        this.title = title;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
}
