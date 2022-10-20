package final_exam.SimonePellisEsameFinale.data.model;

import final_exam.SimonePellisEsameFinale.data.archetype.Dto;
import final_exam.SimonePellisEsameFinale.data.archetype.Model;
import final_exam.SimonePellisEsameFinale.data.dto.BigliettoDTO;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "biglietto")
public class Biglietto implements Model {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "numero_posto")
    private int numeroPosto;

    @Column(name = "prezzo")
    private int prezzo;

    @Override
    public BigliettoDTO toDto() {
        return BigliettoDTO.builder().id(id).numeroPosto(numeroPosto).prezzo(prezzo).build();
    }
}
