package com.example.PeopleManager.model;

public class PeopleManager {
    private String id;
    private String name;
    private String gender;
    private String description;
    private String flashcardId;

    // Constructors
    public PeopleManager(String id, String name, String gender, String description, String flashcardId) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.description = description;
        this.flashcardId = flashcardId;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getFlashcardId() { return flashcardId; }
    public void setFlashcardId(String flashcardId) { this.flashcardId = flashcardId; }
}
