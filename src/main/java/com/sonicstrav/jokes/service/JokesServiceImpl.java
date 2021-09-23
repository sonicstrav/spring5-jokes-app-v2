package com.sonicstrav.jokes.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    private final ChuckNorrisQuotes quotes;

    public JokesServiceImpl() {
        this.quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomJoke() {
        return quotes.getRandomQuote();
    }
}
