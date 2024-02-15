package tn.esprit.houssemproject.services;

import tn.esprit.houssemproject.entites.Bloc;
import tn.esprit.houssemproject.entites.Etudiant;

import java.util.List;

public interface EtudiantService {
    public Etudiant createEtudiant (Etudiant E);
    public Etudiant updateEtudiant (Etudiant E);
    public List<Etudiant> getAllEtudiant ();
    public Etudiant getEtudiant(Long id);
    public void deleteEtudiant(Long id);

    public List<Etudiant> findByReservationsIdReservation(Long id);

}
