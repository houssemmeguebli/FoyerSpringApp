package tn.esprit.houssemproject.entites;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;
    private String nomBloc;
    private long capaciteBloc;

    @ToString.Exclude
    @JsonBackReference
    @ManyToOne
    Foyer foyer;

    @ToString.Exclude
    @OneToMany(mappedBy = "bloc", fetch = FetchType.EAGER)
    Set<Chambre> setChambres;


}
