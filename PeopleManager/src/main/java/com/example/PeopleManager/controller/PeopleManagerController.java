package com.example.PeopleManager.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/peoplemanager")
public class PeopleManagerController {

    private static final List<Map<String, String>> people = List.of(
            Map.of("id", "p1", "name", "Katy", "gender", "Female", "description", "Java Learner", "flashcardId", "fc123"),
            Map.of("id", "p2", "name", "John", "gender", "Male", "description", "Only beginner", "flashcardId", "fc123"),
            Map.of("id", "p3", "name", "Charlie", "gender", "Male", "description", "SpringBoot Pro", "flashcardId", "fc124")
    );

    @GetMapping("/people")
    public List<Map<String, String>> getPeopleByFlashcardId(@RequestParam String flashcardId) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> person : people) {
            if (person.get("flashcardId").equals(flashcardId)) {
                result.add(person);
            }
        }
        return result;
    }
}
