package tn.esprit.houssemproject.services;

import tn.esprit.houssemproject.entites.Bloc;
import tn.esprit.houssemproject.entites.Chambre;

import java.util.List;

public interface ChambreService {
    public Chambre createChambre (Chambre C);
    public Chambre updateChambre (Chambre C);
    public List<Chambre> getAllChambre ();
    public Chambre getChambre(Long id);
    public void deleteChambre(Long id);
    public List<Chambre> findChambrebyfoyer(long id);
}
