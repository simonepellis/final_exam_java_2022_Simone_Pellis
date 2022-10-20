package final_exam.SimonePellisEsameFinale.service.impl;

import final_exam.SimonePellisEsameFinale.data.model.Cinema;
import final_exam.SimonePellisEsameFinale.repository.CinemaRepository;
import final_exam.SimonePellisEsameFinale.service.CinemaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CinemaServiceImpl implements CinemaService {

    private final CinemaRepository cinemaRepository;

    public CinemaServiceImpl(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }


    @Override
    public List<Cinema> getAllCinemas() {
        return cinemaRepository.findAll();
    }

    @Override
    public Optional<Cinema> getCinemaById(String idCinema) {
        return cinemaRepository.findById(idCinema);
    }
}
