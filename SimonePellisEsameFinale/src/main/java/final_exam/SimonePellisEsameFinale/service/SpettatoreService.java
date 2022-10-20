package final_exam.SimonePellisEsameFinale.service;

import final_exam.SimonePellisEsameFinale.data.model.Spettatore;

import java.util.List;
import java.util.Optional;

public interface SpettatoreService {
    public List<Spettatore> getAllSpettatori();

    public Optional<Spettatore> getSpettatoreById(String idSpettatore);

    public Boolean isSpettatoreMaggiorenne(Spettatore spettatore);

    public long getEtaSpettatoreById(String idSpettatore);

    public Spettatore save(Spettatore spettatore);

    public List<Spettatore> getAllSpettatoriMaggiorenni();
}
