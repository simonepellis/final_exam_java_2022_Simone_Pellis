package final_exam.SimonePellisEsameFinale.data.dto;

import final_exam.SimonePellisEsameFinale.data.archetype.Dto;
import final_exam.SimonePellisEsameFinale.data.model.Cinema;
import final_exam.SimonePellisEsameFinale.data.model.SalaCinematografica;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CinemaDTO implements Dto {
    private String id;

   //private List<SalaCinematografica> saleCinematografiche;

    @Override
    public Cinema toModel() {
        return Cinema.builder().id(id).build();
    }
}
