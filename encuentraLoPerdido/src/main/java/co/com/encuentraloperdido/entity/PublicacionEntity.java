package co.com.encuentraloperdido.entity;

import co.com.encuentraloperdido.domain.*;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name ="publicacion")
public class PublicacionEntity {


    @Id
    @GeneratedValue
    @Column(name="id_publicacion")
    private Long idPublicacion;
    @ManyToOne
    @JoinColumn(name="id_categoria")
    private CategoriaEntity categoria;
    @Column(name = "fecha_publicacion")
    private Date fechaPublicacion;
    @ManyToOne
    @JoinColumn(name="id_lugar")
    private LugarEntity lugar;
    @OneToOne
    @JoinColumn(name="id_objeto")
    private ObjetoEntity objeto;
    @ManyToOne
    @JoinColumn(name="id_usuario")
    private UsuarioEntity usuario;
    @ManyToOne
    @JoinColumn(name="id_tipo")
    private TipoEntity tipoPublicacion;
}
