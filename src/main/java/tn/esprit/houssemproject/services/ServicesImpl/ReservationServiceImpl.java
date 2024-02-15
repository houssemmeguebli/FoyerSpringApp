package tn.esprit.houssemproject.services.ServicesImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.houssemproject.entites.Chambre;
import tn.esprit.houssemproject.entites.Etudiant;
import tn.esprit.houssemproject.entites.Reservation;
import tn.esprit.houssemproject.repositories.IChambreRepository;
import tn.esprit.houssemproject.repositories.IReservationRepository;
import tn.esprit.houssemproject.services.ReservationService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final IReservationRepository reservationRepository;

    @Override
    public Reservation createReservation(Reservation R) {
        return reservationRepository.save(R);
    }

    @Override
    public Reservation updateReservation(Reservation R) {
        return reservationRepository.save(R);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return (List<Reservation>) reservationRepository.findAll() ;   }

    @Override
    public Reservation getReservation(Long id) {
        return reservationRepository.findById(id).get();
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> findBySetEtudiantsIdEtudiant(long id) {
        return reservationRepository.findBySetEtudiantsIdEtudiant(id);
    }

}
