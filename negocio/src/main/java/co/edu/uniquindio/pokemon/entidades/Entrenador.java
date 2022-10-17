package co.edu.uniquindio.pokemon.entidades;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Entrenador implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private Integer codigo;
    private String nombre;
    private String user_name;
    private LocalDate fecha_nacimiento;
    private String avatar;
    @OneToMany(mappedBy = "entrenador")
    private List<Pokemon_Capturado>pokemon_capturados;
    @OneToMany(mappedBy = "entrenador")
    private  List<Equipo>equipos;
}
