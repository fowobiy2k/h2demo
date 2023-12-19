package com.fowobi.h2.controller;

import com.fowobi.h2.models.Footwear;
import com.fowobi.h2.service.FootwearService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CoreController {

    private final FootwearService footwearService;

    public CoreController(FootwearService footwearService) {
        this.footwearService = footwearService;
    }

    @GetMapping("/")
    public String welcome() {
        return "<h1>Welcome to our page</h1>";
    }

    @GetMapping("/all")
    public List<Footwear> getAll() {
        return footwearService.getAll();
    }

    @GetMapping("/find/{id}")
    public Footwear findFootwear(@PathVariable( name = "id") long id) {
        return footwearService.getById(id);
    }

    @PostMapping("/new")
    public Footwear newFootwear(@RequestBody Footwear footwear) {
        return footwearService.createNew(footwear);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable( name = "id") long id) {
        return footwearService.delete(id);
    }
}
