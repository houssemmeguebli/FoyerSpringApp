package tn.esprit.houssemproject.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.houssemproject.entites.Chambre;
import tn.esprit.houssemproject.entites.Etudiant;

import java.util.List;

public interface IEtudiantRepository extends CrudRepository<Etudiant,Long> {

    public List<Etudiant> findByReservationsIdReservation(long id);


}

