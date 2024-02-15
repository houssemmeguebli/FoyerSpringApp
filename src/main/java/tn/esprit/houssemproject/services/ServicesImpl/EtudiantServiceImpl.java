package tn.esprit.houssemproject.services.ServicesImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.houssemproject.entites.Bloc;
import tn.esprit.houssemproject.entites.Etudiant;
import tn.esprit.houssemproject.repositories.IEtudiantRepository;
import tn.esprit.houssemproject.services.EtudiantService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EtudiantServiceImpl implements EtudiantService {

    private final IEtudiantRepository etudiantRepository;

    @Override
    public Etudiant createEtudiant(Etudiant E) {
        return etudiantRepository.save(E);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant E) {
        return etudiantRepository.save(E);
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return (List<Etudiant>) etudiantRepository.findAll();
    }

    @Override
    public Etudiant getEtudiant(Long id) {
        return etudiantRepository.findById(id).get();
    }

    @Override
    public void deleteEtudiant(Long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public List<Etudiant> findByReservationsIdReservation(Long id) {
        return etudiantRepository.findByReservationsIdReservation(id);

    }
}
