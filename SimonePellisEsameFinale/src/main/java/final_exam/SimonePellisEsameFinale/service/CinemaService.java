package final_exam.SimonePellisEsameFinale.service;

import final_exam.SimonePellisEsameFinale.data.model.Cinema;

import java.util.List;
import java.util.Optional;

public interface CinemaService {

    public List<Cinema> getAllCinemas();

    public Optional<Cinema> getCinemaById(String idCinema);

}
