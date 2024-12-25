package com.example.FlashCardManager.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/flashcardmanager")
public class FlashCardController {

    private static final Map<String, String> flashcards = Map.of(
            "fc123", "Java Fundamentals",
            "fc124", "Spring Boot Advanced"
    );

    @GetMapping("/flashcards/{id}")
    public Map<String, String> getFlashcardById(@PathVariable String id) {
        if (!flashcards.containsKey(id)) {
            throw new IllegalArgumentException("Flashcard not found");
        }
        return Map.of("id", id, "title", flashcards.get(id));
    }
}
