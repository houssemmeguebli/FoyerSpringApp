package tn.esprit.houssemproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.houssemproject.entites.Universite;
import tn.esprit.houssemproject.services.UniversiteService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("universite")
@RestController
public class UniversiteRestController {

    private final UniversiteService universiteService;

    @PostMapping("/add")
    public Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.createUniversite(universite);
    }

    @GetMapping("/all")
    public List<Universite> getAllUniversites() {
        return universiteService.getAllUniversite();
    }

    @GetMapping("/{id}")
    public Universite getUniversiteById(@PathVariable("id") Long id) {
        return universiteService.getUniversite(id);
    }

    @PutMapping("/{id}")
    public Universite updateUniversite(@PathVariable("id") Long id, @RequestBody Universite updatedUniversite) {
        return universiteService.updateUniversite(updatedUniversite);
    }

    @DeleteMapping("/{id}")
    public void deleteUniversite(@PathVariable("id") Long id) {
        universiteService.deleteUniversite(id);
    }


    @GetMapping("/foyer_bloc/{id}")
    public List<Universite>findingByFoyerSetBlocsIdBloc(@PathVariable("id") Long id) {
        return universiteService.findByFoyerSetBlocsIdBloc(id);
    }

}