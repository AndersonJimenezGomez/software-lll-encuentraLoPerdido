package co.com.encuentraloperdido.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="tipo")
public class TipoEntity {

    @Id
    @GeneratedValue
    @Column(name="id_tipo")
    public Long idTipo;
    @Column(name="tipo")
    public String tipo;
}
