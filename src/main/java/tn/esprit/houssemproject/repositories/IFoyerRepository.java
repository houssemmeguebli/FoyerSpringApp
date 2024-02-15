package tn.esprit.houssemproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import tn.esprit.houssemproject.entites.Foyer;

import java.util.List;
import java.util.SimpleTimeZone;

public interface IFoyerRepository extends CrudRepository<Foyer,Long> {

    List<Foyer> findBySetBlocsSetChambresIdChambre(long id);

}
