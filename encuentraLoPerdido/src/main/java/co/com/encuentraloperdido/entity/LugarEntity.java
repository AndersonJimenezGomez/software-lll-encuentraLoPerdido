package co.com.encuentraloperdido.entity;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Data
@Entity
@Table(name ="lugar")
public class LugarEntity {

    @Id
    @GeneratedValue
    @Column(name="id_lugar")
    private Long idLugar;
    @Column(name="descripcion_lugar")
    private String descripcionLugar;
    @Column(name="direccion")
    private String direccion;
}
