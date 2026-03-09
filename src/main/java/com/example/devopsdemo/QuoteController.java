package com.example.devopsdemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quotes")
public class QuoteController {

    private final QuoteRepository quoteRepository;

    public QuoteController(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    @GetMapping
    public List<Quote> getAllQuotes() {
        return quoteRepository.findAll();
    }

    @PostMapping
    public Quote createQuote(@RequestBody Quote quote) {
        return quoteRepository.save(quote);
    }
}
