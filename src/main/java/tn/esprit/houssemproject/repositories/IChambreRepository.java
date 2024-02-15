package tn.esprit.houssemproject.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.houssemproject.entites.Chambre;

import java.util.List;

public interface IChambreRepository extends CrudRepository<Chambre,Long> {
    public List<Chambre> findByBlocFoyerIdFoyer(long idFoyer);
}
