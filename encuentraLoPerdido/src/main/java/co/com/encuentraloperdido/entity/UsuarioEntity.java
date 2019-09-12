package co.com.encuentraloperdido.entity;

import lombok.Data;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@Data
@Entity
@Table(name ="usuario")
public class UsuarioEntity {


    @Id
    @GeneratedValue
    @Column(name="id_usuario")
    private Long idUsuario;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="correo")
    private String correo;
    @Column(name="clave")
    private String clave;

}
