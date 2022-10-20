package final_exam.SimonePellisEsameFinale.data.request.essentials;


import final_exam.SimonePellisEsameFinale.data.model.Biglietto;
import final_exam.SimonePellisEsameFinale.data.model.Spettatore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SpettatoreInsertRequest {

    private String nome;

    private String cognome;

    private Instant dataNascita;


    public Spettatore toSpettatore() {
        return Spettatore.builder().nome(nome).cognome(cognome).dataNascita(dataNascita).build();
    }

}
