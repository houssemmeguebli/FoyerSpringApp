package tn.esprit.houssemproject.services.ServicesImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.houssemproject.entites.Foyer;
import tn.esprit.houssemproject.entites.Universite;
import tn.esprit.houssemproject.repositories.IFoyerRepository;
import tn.esprit.houssemproject.repositories.IUniversiteRepository;
import tn.esprit.houssemproject.services.FoyerService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoyerServiceImpl implements FoyerService {

    private final IFoyerRepository foyerRepository;

    @Override
    public Foyer createFoyer(Foyer F) {
        return foyerRepository.save(F);
    }

    @Override
    public Foyer updateFoyer(Foyer F) {
        return foyerRepository.save(F);
    }

    @Override
    public List<Foyer> getAllFoyer() {
        return (List<Foyer>) foyerRepository.findAll();
    }

    @Override
    public Foyer getFoyer(Long id) {
        return foyerRepository.findById(id).get();
    }

    @Override
    public void deleteFoyer(Long id) {
        foyerRepository.deleteById(id);
    }

    @Override
    public List<Foyer> findByBlocSetChambresIdChambre(long id) {
        return foyerRepository.findBySetBlocsSetChambresIdChambre(id);
    }
    

    private IUniversiteRepository universiteRepository;
    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, long idUniversite) {
        Foyer foyer = foyerRepository.findById(idFoyer).orElse(null);

        Universite universite = universiteRepository.findById(idUniversite).orElse(null);

        if (foyer != null && universite != null) {
            universite.setFoyer(foyer);
            foyer.setUniversite(universite);

            universiteRepository.save(universite);
            foyerRepository.save(foyer);

            return universite;
        }

        return null;
    }
    @Override
    public Universite desaffecterFoyerDeUniversite(long idUniversite) {

        Universite universite = universiteRepository.findById(idUniversite).orElse(null);

        if (universite != null) {
            Foyer foyerAffecte = universite.getFoyer();

            if (foyerAffecte != null) {
                universite.setFoyer(null);
                foyerAffecte.setUniversite(null);
                universiteRepository.save(universite);
                foyerRepository.save(foyerAffecte);

                return universite;
            }
        }

        return null;
    }
}
