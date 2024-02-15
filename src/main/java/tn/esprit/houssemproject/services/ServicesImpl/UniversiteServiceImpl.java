package tn.esprit.houssemproject.services.ServicesImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.houssemproject.entites.Universite;
import tn.esprit.houssemproject.repositories.IUniversiteRepository;
import tn.esprit.houssemproject.services.UniversiteService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UniversiteServiceImpl implements UniversiteService {

    private final IUniversiteRepository universiteRepository;

    @Override
    public Universite createUniversite(Universite U) {
        return universiteRepository.save(U);
    }

    @Override
    public Universite updateUniversite(Universite U) {
        return universiteRepository.save(U);
    }

    @Override
    public List<Universite> getAllUniversite() {
        return (List<Universite>) universiteRepository.findAll();
    }

    @Override
    public Universite getUniversite(Long id) {
        return universiteRepository.findById(id).get();
    }

    @Override
    public void deleteUniversite(Long id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public List<Universite> findByFoyerSetBlocsIdBloc(long id) {
        return universiteRepository.findByFoyerSetBlocsIdBloc(id);
    }
}
