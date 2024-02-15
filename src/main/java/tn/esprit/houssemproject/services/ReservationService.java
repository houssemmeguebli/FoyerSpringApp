package tn.esprit.houssemproject.services;

import tn.esprit.houssemproject.entites.Foyer;
import tn.esprit.houssemproject.entites.Reservation;

import java.util.List;

public interface ReservationService {
    public Reservation createReservation (Reservation R);
    public Reservation updateReservation (Reservation R);
    public List<Reservation> getAllReservation ();
    public Reservation getReservation(Long id);
    public void deleteReservation(Long id);
    public List<Reservation> findBySetEtudiantsIdEtudiant(long id);

}
