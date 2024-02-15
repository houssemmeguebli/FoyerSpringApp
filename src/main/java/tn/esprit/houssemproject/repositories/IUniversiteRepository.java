package tn.esprit.houssemproject.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.houssemproject.entites.Reservation;
import tn.esprit.houssemproject.entites.Universite;

import java.util.List;

public interface IUniversiteRepository extends CrudRepository<Universite,Long>{

    public List<Universite> findByFoyerSetBlocsIdBloc(long id);

}
