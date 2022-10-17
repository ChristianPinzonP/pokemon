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

public class Equipo implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private Integer codigo;
    @OneToOne
    private Pokemon_Capturado pokemon1;
    @OneToOne
    private Pokemon_Capturado pokemon2;
    @OneToOne
    private Pokemon_Capturado pokemon3;
    @ManyToOne
    private Entrenador entrenador;
    @OneToMany(mappedBy = "equipo1")
    private List<Combate>combates;

}
