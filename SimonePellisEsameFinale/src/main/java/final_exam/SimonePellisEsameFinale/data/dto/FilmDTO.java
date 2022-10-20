package final_exam.SimonePellisEsameFinale.data.dto;

import final_exam.SimonePellisEsameFinale.data.archetype.Dto;
import final_exam.SimonePellisEsameFinale.data.archetype.Model;
import final_exam.SimonePellisEsameFinale.data.enums.Generi;
import final_exam.SimonePellisEsameFinale.data.model.Film;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FilmDTO implements Dto {

    private String id;

    private String titoloFilm;

    private String autore;

    private String produttore;

    private Generi genere;

    private int etaMinima;

    @Override
    public Film toModel() {
        return Film.builder().id(id).titoloFilm(titoloFilm).autore(autore).produttore(produttore).
                genere(genere).etaMinima(etaMinima).build();
    }
}
