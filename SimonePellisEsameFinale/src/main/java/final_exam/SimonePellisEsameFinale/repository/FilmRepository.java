package final_exam.SimonePellisEsameFinale.repository;

import final_exam.SimonePellisEsameFinale.data.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, String> {
}
