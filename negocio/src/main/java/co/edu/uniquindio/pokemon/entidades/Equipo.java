package co.edu.uniquindio.pokemon.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.io.Serializable;
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

}
