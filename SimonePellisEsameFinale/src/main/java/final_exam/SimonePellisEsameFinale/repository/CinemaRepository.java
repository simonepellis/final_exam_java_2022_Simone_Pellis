package final_exam.SimonePellisEsameFinale.repository;

import final_exam.SimonePellisEsameFinale.data.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema, String> {
}
