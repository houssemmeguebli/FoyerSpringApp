package tn.esprit.houssemproject.services;

import tn.esprit.houssemproject.entites.Foyer;
import tn.esprit.houssemproject.entites.Universite;

import java.util.List;

public interface FoyerService {
    public Foyer createFoyer (Foyer F);
    public Foyer updateFoyer (Foyer F);
    public List<Foyer> getAllFoyer ();
    public Foyer getFoyer(Long id);
    public void deleteFoyer(Long id);

    List<Foyer> findByBlocSetChambresIdChambre(long id);
    public Universite affecterFoyerAUniversite(long idFoyer, long idUniversite);
    public Universite desaffecterFoyerDeUniversite(long idUniversite);

}
