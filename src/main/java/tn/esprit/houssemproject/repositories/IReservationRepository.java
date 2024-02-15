package tn.esprit.houssemproject.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.houssemproject.entites.Etudiant;
import tn.esprit.houssemproject.entites.Reservation;

import java.util.List;

public interface IReservationRepository extends CrudRepository<Reservation,Long>{

    public List<Reservation> findBySetEtudiantsIdEtudiant(long id);

}
