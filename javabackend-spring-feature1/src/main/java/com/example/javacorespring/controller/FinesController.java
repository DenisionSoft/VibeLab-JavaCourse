package com.example.javacorespring.controller;


import com.example.javacorespring.Fine;
import com.example.javacorespring.FinesDB;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/fines")
public class FinesController {

    @GetMapping
    public List<Fine> getAll() {
        return FinesDB.getAll();
    }

    @GetMapping("/{id}")
    public Fine getOne(@PathVariable long id) {
        return FinesDB.getOne(id);
    }

    @PostMapping
    public Fine addFine(@RequestBody Fine fine) {
        return FinesDB.addFine(fine);
    }

    @PutMapping
    public Fine updateFine(@RequestBody Fine fine) {
        return FinesDB.updateFine(fine.getId(), fine);
    }

    @DeleteMapping
    public void deleteFine(@RequestBody long id) {
        FinesDB.deleteFine(id);
    }

    @PatchMapping("/{id}/pay")
    public void payFine(@PathVariable long id) {
        FinesDB.payFine(id);
    }

    @PatchMapping("/{id}/court")
    public void sendSubpoena(@PathVariable long id) {
        FinesDB.sendSubpoena(id);
    }

}
