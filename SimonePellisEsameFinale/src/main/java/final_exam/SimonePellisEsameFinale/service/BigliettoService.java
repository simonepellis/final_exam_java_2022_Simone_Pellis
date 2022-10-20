package final_exam.SimonePellisEsameFinale.service;

import final_exam.SimonePellisEsameFinale.data.model.Biglietto;

import java.util.List;
import java.util.Optional;

public interface BigliettoService {

    public List<Biglietto> getAllBiglietti();
    public Optional<Biglietto> getBigliettoById(String idBiglietto);
}
