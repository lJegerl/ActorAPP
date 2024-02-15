package by.red.lab5.controller;


import java.util.concurrent.atomic.AtomicLong;


import by.red.lab5.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

@CrossOrigin(origins = "*")
public class ActorController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private ActorRepository actorRepository;




    @GetMapping(value="/ActorsAll"
    )
    public String getActors(Model model) {
        model.addAttribute("actors", actorRepository.findAll());

        return "actor/list";

    }



}
