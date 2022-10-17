package co.edu.uniquindio.pokemon.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Combate implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private Integer codigo;
    private LocalDateTime fecha;
}
