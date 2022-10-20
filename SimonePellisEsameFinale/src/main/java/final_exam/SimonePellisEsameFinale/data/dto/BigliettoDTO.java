package final_exam.SimonePellisEsameFinale.data.dto;

import final_exam.SimonePellisEsameFinale.data.archetype.Dto;
import final_exam.SimonePellisEsameFinale.data.archetype.Model;
import final_exam.SimonePellisEsameFinale.data.model.Biglietto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BigliettoDTO implements Dto {

    private String id;
    private int numeroPosto;
    private int prezzo;

    @Override
    public Biglietto toModel() {
        return Biglietto.builder().id(id).numeroPosto(numeroPosto).prezzo(prezzo).build();
    }
}
