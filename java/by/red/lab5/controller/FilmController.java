package by.red.lab5.controller;

import java.util.concurrent.atomic.AtomicLong;

import by.red.lab5.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;


@Controller
@CrossOrigin(origins = "*")
public class FilmController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private FilmRepository filmRepository;


    @GetMapping(value="/FilmesAll"
    )
    public String getFilmes(Model model) {
        model.addAttribute("filmes", filmRepository.findAll());

        return "film/list";

    }

}
