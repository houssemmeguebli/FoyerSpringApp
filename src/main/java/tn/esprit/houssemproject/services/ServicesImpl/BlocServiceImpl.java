package tn.esprit.houssemproject.services.ServicesImpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.houssemproject.repositories.IBlocRepository;
import tn.esprit.houssemproject.entites.Bloc;
import tn.esprit.houssemproject.services.BlocService;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

@Service
@RequiredArgsConstructor
@RestController
@Slf4j
public class BlocServiceImpl implements BlocService {

    private final IBlocRepository blocRepository;
    @Override
    public Bloc createBloc(Bloc B) {

        return blocRepository.save(B);
    }
    @Override
    public Bloc updateBloc(Bloc B) {
        return blocRepository.save(B);

    }
    @Override
    public List<Bloc> getAllBloc() {
        return (List<Bloc>) blocRepository.findAll();
    }

    @Scheduled(fixedRate = 30000)
    public void afficheAllBlocs() {
        List<Bloc> blocs = getAllBloc();
        System.out.println("Liste des blocs :");
        log.info(blocs.toString());

    }

    @Override
    public Bloc getBloc(Long id) {
        return blocRepository.findById(id).get();
    }

    @Override
    public void deleteBloc(Long id) {
        blocRepository.deleteById(id);
    }







}
