package final_exam.SimonePellisEsameFinale.service.impl;

import final_exam.SimonePellisEsameFinale.data.model.Spettatore;
import final_exam.SimonePellisEsameFinale.repository.SpettatoreRepository;
import final_exam.SimonePellisEsameFinale.service.SpettatoreService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SpettatoreServiceImpl implements SpettatoreService {

    private final SpettatoreRepository spettatoreRepository;

    public SpettatoreServiceImpl(SpettatoreRepository spettatoreRepository) {
        this.spettatoreRepository = spettatoreRepository;
    }


    @Override
    public List<Spettatore> getAllSpettatori() {
        return spettatoreRepository.findAll();
    }

    @Override
    public Optional<Spettatore> getSpettatoreById(String idSpettatore) {
        return spettatoreRepository.findById(idSpettatore);
    }

    @Override
    public Boolean isSpettatoreMaggiorenne(Spettatore spettatore) {
        if (getSpettatoreById(spettatore.getId()).isPresent()) {
            Spettatore spettatoreInCarico = getSpettatoreById(spettatore.getId()).get();
            long etaSpettatore = ChronoUnit.YEARS.between(Instant.now(), spettatore.getDataNascita());
            if (etaSpettatore >= 18L) {
                return true;
            }
        }
        return false;
    }

    @Override
    public long getEtaSpettatoreById(String idSpettatore) {
        if (getSpettatoreById(idSpettatore).isPresent()) {
            Spettatore spettatore = getSpettatoreById(idSpettatore).get();
            long etaSpettatore = ChronoUnit.YEARS.between(Instant.now(), spettatore.getDataNascita());
            return etaSpettatore;
        }
        return 0L;
    }

    @Override
    public Spettatore save(Spettatore spettatore) {
        return spettatoreRepository.save(spettatore);
    }

    @Override
    public List<Spettatore> getAllSpettatoriMaggiorenni() {
        List<Spettatore> spettatoriMaggiorenni = new ArrayList<>();
        List<Spettatore> spettatoreList = spettatoreRepository.findAll();
        for (Spettatore spettatore : spettatoreList) {
            if (isSpettatoreMaggiorenne(spettatore)) {
                spettatoriMaggiorenni.add(spettatore);
            }
        }

        return spettatoriMaggiorenni;
    }
}
