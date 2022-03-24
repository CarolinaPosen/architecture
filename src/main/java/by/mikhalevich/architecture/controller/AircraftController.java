package by.mikhalevich.architecture.controller;

import by.mikhalevich.architecture.model.Aircraft;
import by.mikhalevich.architecture.repositories.AircraftCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/aircrafts")
public class AircraftController {

    private final AircraftCrudRepository repository;

    public AircraftController(@Autowired AircraftCrudRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/aircrafts")
    public List<Aircraft> getAircrafts() {
        return repository.findAll();
    }

    @GetMapping("/aircraft/{id}")
    public Aircraft getAircraft(@PathVariable String id) {
        return this.repository.findById(id).get();
    }

}
