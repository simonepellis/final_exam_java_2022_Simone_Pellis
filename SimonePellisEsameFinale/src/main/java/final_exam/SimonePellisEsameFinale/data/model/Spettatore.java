package final_exam.SimonePellisEsameFinale.data.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import final_exam.SimonePellisEsameFinale.data.archetype.Dto;
import final_exam.SimonePellisEsameFinale.data.archetype.Model;
import final_exam.SimonePellisEsameFinale.data.dto.SpettatoreDTO;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "spettatore")
public class Spettatore implements Model {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "data_nascita")
    private Instant dataNascita;

    @OneToOne
    @JoinColumn(name = "id_biglietto")
    @JsonBackReference(value = "biglietto")
    private Biglietto biglietto;

    @Override
    public SpettatoreDTO toDto() {
        return SpettatoreDTO.builder().id(id).nome(nome).cognome(cognome).dataNascita(dataNascita).bigliettoDTO(biglietto.toDto()).build();
    }
}
