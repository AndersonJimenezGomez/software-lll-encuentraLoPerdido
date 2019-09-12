package co.com.encuentraloperdido.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name ="objeto")
public class ObjetoEntity {


    @Id
    @GeneratedValue
    @Column(name="id_objeto")
    public Long idObjeto;
    @Column(name="descripcion")
    public String descripcion;
    @Column(name = "fecha")
    public Date fecha;
}
