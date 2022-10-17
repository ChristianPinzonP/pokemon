package co.edu.uniquindio.pokemon.entidades;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
@Entity

public class Pokemon_Capturado implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @EqualsAndHashCode.Include
    private Integer codigo;
    private String nombre;
    private String salud;
    private String nivel;
    private String ataque;
    private String defensa;
    private String ataque_especial;
    private String defensa_especial;
    @ManyToOne
    private Pokemon pokemon;
    @ManyToOne
    private Entrenador entrenador;
    @ManyToMany(mappedBy = "pokemon_capturados")
    private List<Movimiento>movimientos;
}
