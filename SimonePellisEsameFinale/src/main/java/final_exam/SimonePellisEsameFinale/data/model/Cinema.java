package final_exam.SimonePellisEsameFinale.data.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import final_exam.SimonePellisEsameFinale.data.archetype.Dto;
import final_exam.SimonePellisEsameFinale.data.archetype.Model;
import final_exam.SimonePellisEsameFinale.data.dto.CinemaDTO;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cinema")
public class Cinema implements Model {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    /*@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "cinema")
    @JsonManagedReference(value = "sala")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<SalaCinematografica> saleCinematografiche;*/

    @Override
    public CinemaDTO toDto() {
        return CinemaDTO.builder().id(id).build();
    }
}
