package tn.esprit.houssemproject.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.houssemproject.entites.Bloc;
import tn.esprit.houssemproject.services.BlocService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("bloc")
@RestController
public class BlocRestController {

    private final BlocService blocService;

    @PostMapping("/add")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.createBloc(bloc);
    }

    @GetMapping("/all")
    public List<Bloc> getAllBlocs() {
        return blocService.getAllBloc();
    }

    @GetMapping("/{id}")
    public Bloc getBlocById(@PathVariable("id") Long id) {
        return blocService.getBloc(id);
    }

    @PutMapping("/{id}")
    public Bloc updateBloc(@PathVariable("id") Long id, @RequestBody Bloc updatedBloc) {
        return blocService.createBloc(updatedBloc);
    }

    @DeleteMapping("/{id}")
    public void deleteBloc(@PathVariable("id") Long id) {
        blocService.deleteBloc(id);
    }



    /*
    @GetMapping("/foyer_universite/{id}")
    public List<Bloc> findingBlocbyUniversite(@PathVariable("id") Long id) {
        return blocService.findBlocsbyUniversite(id);
    }

     */
}