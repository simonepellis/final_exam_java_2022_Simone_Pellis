package final_exam.SimonePellisEsameFinale.data.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import final_exam.SimonePellisEsameFinale.data.archetype.Dto;
import final_exam.SimonePellisEsameFinale.data.archetype.Model;
import final_exam.SimonePellisEsameFinale.data.dto.SalaCinematograficaDTO;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sala")
public class SalaCinematografica implements Model {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    @Column(name = "capacita_sala")
    private int maxCapacita;

    @ManyToOne
    @JoinColumn(name = "id_film")
    @JsonBackReference(value = "film")
    private Film filmInProiezione;

    @Override
    public SalaCinematograficaDTO toDto() {
        return SalaCinematograficaDTO.builder().id(id).maxCapacita(maxCapacita).filmDTO(filmInProiezione.toDto()).build();
    }
}
