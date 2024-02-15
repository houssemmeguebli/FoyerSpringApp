package tn.esprit.houssemproject.services;

import tn.esprit.houssemproject.entites.Universite;

import java.util.List;

public interface UniversiteService {
    public Universite createUniversite (Universite U);
    public Universite updateUniversite (Universite U);
    public List<Universite> getAllUniversite ();
    public Universite getUniversite(Long id);
    public void deleteUniversite(Long id);
    public List<Universite> findByFoyerSetBlocsIdBloc(long id);

}
