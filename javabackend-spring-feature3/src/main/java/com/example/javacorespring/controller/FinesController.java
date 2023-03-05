package com.example.javacorespring.controller;


import com.example.javacorespring.domain.Fine;
import com.example.javacorespring.exceptions.NotFoundException;
import com.example.javacorespring.repo.FineRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/fines")
public class FinesController {
    private final FineRepo fineRepo;
    @Autowired
    public FinesController(FineRepo fineRepo) {
        this.fineRepo = fineRepo;
    }

    @GetMapping
    public List<Fine> getAll() {
        return fineRepo.findAll();
    }

    @GetMapping("/{id}")
    public Fine getOne(@PathVariable("id") Fine fine) {
        return fine;
    }
    @GetMapping("/{page}/{size}")
    public Page<Fine> pagePages(@PathVariable("page") int page, @PathVariable("size") int size) {
        Pageable customPage = PageRequest.of(page, size);
        return fineRepo.findAll(customPage);
    }
    @GetMapping("/{page}/{size}/{sort}")
    public Page<Fine> pagePages(@PathVariable("page") int page, @PathVariable("size") int size, @PathVariable("sort") String sort) {
        Pageable customPage = PageRequest.of(page, size, Sort.by(sort));
        return fineRepo.findAll(customPage);
    }

    @PostMapping
    public Fine addFine(@RequestBody Fine fine) {
        return fineRepo.save(fine);
    }

    @PutMapping("/{id}")
    public Fine updateFine(
            @PathVariable("id") Fine fineFromDB,
            @RequestBody Fine fine
    ) {
        BeanUtils.copyProperties(fine, fineFromDB, "id");
        return fineRepo.save(fineFromDB);
    }

    @DeleteMapping
    public void deleteFine(@RequestBody long id) {
        try {
            fineRepo.deleteById(id);
        } catch (Exception e) {
            throw new NotFoundException();
        }
    }

    @PatchMapping("/{id}/pay")
    public void payFine(@PathVariable("id") Fine fine) {
        fine.setPaid(true);
        fineRepo.save(fine);
    }

    @PatchMapping("/{id}/court")
    public void sendSubpoena(@PathVariable("id") Fine fine) {
        fine.setSubpoena(true);
        fineRepo.save(fine);
    }

}
