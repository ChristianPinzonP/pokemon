package co.edu.uniquindio.pokemon.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Gimnasio implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @EqualsAndHashCode.Include
    private Integer codigo;
    private String nombre;
    @OneToMany(mappedBy = "gimnasio")
    private List<Combate>combates;

}
