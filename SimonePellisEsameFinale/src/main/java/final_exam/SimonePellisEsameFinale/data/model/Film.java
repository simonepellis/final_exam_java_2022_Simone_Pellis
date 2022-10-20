package final_exam.SimonePellisEsameFinale.data.model;

import final_exam.SimonePellisEsameFinale.data.archetype.Model;
import final_exam.SimonePellisEsameFinale.data.dto.FilmDTO;
import final_exam.SimonePellisEsameFinale.enums.Generi;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "film")
public class Film implements Model {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "titolo")
    private String titoloFilm;

    @Column(name = "autore")
    private String autore;

    @Column(name = "produttore")
    private String produttore;

    @Column(name = "genere")
    private Generi genere;

    @Column(name = "eta_minima")
    private int etaMinima;

    @Override
    public FilmDTO toDto() {
        return FilmDTO.builder().id(id).titoloFilm(titoloFilm).autore(autore).produttore(produttore)
                .genere(genere).etaMinima(etaMinima).build();
    }
}
