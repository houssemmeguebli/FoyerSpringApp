package tn.esprit.houssemproject.services;

import tn.esprit.houssemproject.entites.Bloc;

import java.util.List;

public interface BlocService {
    public Bloc createBloc (Bloc B);
    public Bloc updateBloc (Bloc B);
    public List<Bloc> getAllBloc ();
    public Bloc getBloc(Long id);
    public void deleteBloc(Long id);

   // public List<Bloc> findBlocsbyUniversite(Long id);

    public void afficheAllBlocs();

    }
