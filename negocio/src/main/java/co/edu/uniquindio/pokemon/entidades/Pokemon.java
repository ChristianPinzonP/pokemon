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

public class Pokemon implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @EqualsAndHashCode.Include
    private Integer numero;
    private String nombre;
    private String foto;

    @ManyToOne
    private Region region;
    @ManyToOne
    private Tipo tipo;
    @OneToMany(mappedBy = "pokemon")
    private List<Pokemon_Capturado>pokemon_capturados;
}
