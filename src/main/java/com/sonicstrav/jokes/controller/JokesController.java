package com.sonicstrav.jokes.controller;

import com.sonicstrav.jokes.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService jokeService;

    public JokesController(JokesService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.getRandomJoke());
        return "index";
    }

}
