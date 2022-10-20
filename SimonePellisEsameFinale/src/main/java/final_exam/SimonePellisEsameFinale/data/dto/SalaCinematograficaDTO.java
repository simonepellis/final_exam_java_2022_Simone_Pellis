package final_exam.SimonePellisEsameFinale.data.dto;

import final_exam.SimonePellisEsameFinale.data.archetype.Dto;
import final_exam.SimonePellisEsameFinale.data.archetype.Model;
import final_exam.SimonePellisEsameFinale.data.model.SalaCinematografica;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SalaCinematograficaDTO implements Dto {

    private String id;

    private int maxCapacita;

    private FilmDTO filmDTO;
    @Override
    public SalaCinematografica toModel() {
        return null;
    }
}
