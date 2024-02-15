package tn.esprit.houssemproject.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.houssemproject.entites.Bloc;

import java.util.List;

public interface IBlocRepository extends CrudRepository<Bloc,Long> {

    public List<Bloc> findByFoyerUniversiteIdUniversite(Long id);

}
