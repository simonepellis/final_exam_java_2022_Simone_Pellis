package final_exam.SimonePellisEsameFinale.service.impl;

import final_exam.SimonePellisEsameFinale.data.model.Film;
import final_exam.SimonePellisEsameFinale.data.model.SalaCinematografica;
import final_exam.SimonePellisEsameFinale.data.model.Spettatore;
import final_exam.SimonePellisEsameFinale.repository.SalaCinematograficaRepository;
import final_exam.SimonePellisEsameFinale.service.SalaCinematograficaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaCinematograficaServiceImpl implements SalaCinematograficaService {
    private final SalaCinematograficaRepository salaCinematograficaRepository;

    public SalaCinematograficaServiceImpl(SalaCinematograficaRepository salaCinematograficaRepository) {
        this.salaCinematograficaRepository = salaCinematograficaRepository;
    }


    @Override
    public List<SalaCinematografica> getAllSale() {
        return salaCinematograficaRepository.findAll();
    }

    @Override
    public Optional<SalaCinematografica> getSalaById(String idSala) {
        return salaCinematograficaRepository.findById(idSala);
    }

    @Override
    public int calcoloIncassoSala(SalaCinematografica sala) {
        int incasso = 0;
        List<Spettatore> spettatoriPresenti = sala.getPersoneInSala();
        for (Spettatore spettatore : spettatoriPresenti) {
            incasso = incasso + spettatore.getBiglietto().getPrezzo();
        }
        return incasso;
    }
}
