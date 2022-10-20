package final_exam.SimonePellisEsameFinale.data.dto;

import final_exam.SimonePellisEsameFinale.data.archetype.Dto;
import final_exam.SimonePellisEsameFinale.data.archetype.Model;
import final_exam.SimonePellisEsameFinale.data.model.SalaCinematografica;
import final_exam.SimonePellisEsameFinale.data.model.Spettatore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SalaCinematograficaDTO implements Dto {

    private String id;

    private int maxCapacita;

    private FilmDTO filmDTOInProiezione;

    private List<Spettatore> personeInSala;
    @Override
    public SalaCinematografica toModel() {
        return SalaCinematografica.builder().id(id).maxCapacita(maxCapacita).filmInProiezione(filmDTOInProiezione.toModel()).build();
    }
}
