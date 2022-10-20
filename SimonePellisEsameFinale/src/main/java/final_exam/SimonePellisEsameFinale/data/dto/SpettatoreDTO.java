package final_exam.SimonePellisEsameFinale.data.dto;

import final_exam.SimonePellisEsameFinale.data.archetype.Dto;
import final_exam.SimonePellisEsameFinale.data.archetype.Model;
import final_exam.SimonePellisEsameFinale.data.model.Spettatore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SpettatoreDTO implements Dto {

    private String id;
    private String nome;
    private String cognome;
    private Instant dataNascita;
    private BigliettoDTO bigliettoDTO;

    @Override
    public Spettatore toModel() {
        return Spettatore.builder().id(id).nome(nome).cognome(cognome).dataNascita(dataNascita).biglietto(bigliettoDTO.toModel()).build();
    }
}
