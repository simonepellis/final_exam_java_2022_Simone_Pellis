package final_exam.SimonePellisEsameFinale.service.impl;

import final_exam.SimonePellisEsameFinale.data.model.Biglietto;
import final_exam.SimonePellisEsameFinale.repository.BigliettoRepository;
import final_exam.SimonePellisEsameFinale.service.BigliettoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BigliettoServiceImpl implements BigliettoService {

    private final BigliettoRepository bigliettoRepository;

    public BigliettoServiceImpl(BigliettoRepository bigliettoRepository) {
        this.bigliettoRepository = bigliettoRepository;
    }

    @Override
    public List<Biglietto> getAllBiglietti() {
        return bigliettoRepository.findAll();
    }

    @Override
    public Optional<Biglietto> getBigliettoById(String idBiglietto) {
        return bigliettoRepository.findById(idBiglietto);
    }
}
