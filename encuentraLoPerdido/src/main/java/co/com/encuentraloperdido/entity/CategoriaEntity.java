package co.com.encuentraloperdido.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="categoria")
public class CategoriaEntity {

    @Id
    @GeneratedValue
    @Column(name="id_categoria")
    public Long idCategoria;
    @Column(name="categoria")
    public String categoria;
}
