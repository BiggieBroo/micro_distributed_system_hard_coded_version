package com.example.FlashCardFuns.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
@RequestMapping("/flashcardfuns")
public class FlashCardFunsController {

    private final RestTemplate restTemplate;

    public FlashCardFunsController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/getByFlashCardId")
    public Map<String, Object> getByFlashCardId(@RequestParam String cardId) {
        String flashcardServiceUrl = "http://localhost:8081/flashcardmanager/flashcards/" + cardId;
        String peopleServiceUrl = "http://localhost:8082/peoplemanager/people?flashcardId=" + cardId;

        Map<String, String> flashcard = restTemplate.getForObject(flashcardServiceUrl, Map.class);
        List<Map<String, String>> people = restTemplate.getForObject(peopleServiceUrl, List.class);

        if (flashcard == null) {
            throw new IllegalArgumentException("Flashcard not found");
        }

        Map<String, Object> response = new HashMap<>();
        response.put("flashcardId", flashcard.get("id"));
        response.put("people", people);

        return response;
    }
}
