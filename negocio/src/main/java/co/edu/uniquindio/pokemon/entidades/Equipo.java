package co.edu.uniquindio.pokemon.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
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
}
