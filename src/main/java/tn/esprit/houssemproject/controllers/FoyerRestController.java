package tn.esprit.houssemproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.houssemproject.entites.Foyer;
import tn.esprit.houssemproject.entites.Universite;
import tn.esprit.houssemproject.services.FoyerService;
import tn.esprit.houssemproject.services.ServicesImpl.UniversiteServiceImpl;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("foyer")
@RestController
public class FoyerRestController {

    private final FoyerService foyerService;

    @PostMapping("/add")
    public Foyer addFoyer (@RequestBody Foyer f){
        return foyerService.createFoyer(f);
    }

    @GetMapping("/all")
    public List<Foyer> getAllFoyer() {
        return foyerService.getAllFoyer();
    }

    @GetMapping("/{id}")
    public Foyer getFoyerById(@PathVariable("id") Long id) {
        return foyerService.getFoyer(id);
    }

    @PutMapping("/{id}")
    public Foyer updateFoyer(@PathVariable("id") Long id, @RequestBody Foyer updatedFoyer) {
        return foyerService.updateFoyer(updatedFoyer);
    }

    @DeleteMapping("/{id}")
    public void deleteFoyer(@PathVariable("id") Long id) {
        foyerService.deleteFoyer(id);

    }
    @GetMapping("/bloc_chambre/{id}")
    public List<Foyer> findingByBlocSetChambresIdChambre(@PathVariable("id") Long id) {
        return foyerService.findByBlocSetChambresIdChambre(id);
    }

    private UniversiteServiceImpl universiteService;

    @PostMapping("/affecter-foyer")
    public Universite affecterFoyerAUniversite(@RequestParam long idFoyer, @RequestParam long idUniversite) {
        return foyerService.affecterFoyerAUniversite(idFoyer,idUniversite);
    }

    @PutMapping("/desaffecter-foyer/{id}/")
    public Universite desaffecterFoyerDeUniversite(@PathVariable long idUniversite) {
        return foyerService.desaffecterFoyerDeUniversite(idUniversite);
    }
}
