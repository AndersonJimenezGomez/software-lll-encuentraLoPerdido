package co.com.encuentraloperdido.domain;

import co.com.encuentraloperdido.bussinesexception.usuario.CorreoNoValidoException;
import co.com.encuentraloperdido.bussinesexception.usuario.NombreOApellidoNoValidoException;
import co.com.encuentraloperdido.message.Mensaje;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Usuario {

    private Long idUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private String clave;

    public Usuario(Long idUsuario, String nombre, String apellido, String correo, String clave) {
            this.setIdUsuario(idUsuario);
            this.setApellido(apellido);
            this.setCorreo(correo);
            this.setNombre(nombre);
            this.setClave(clave);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre)throws NombreOApellidoNoValidoException {
        if(validarCadenaNoContengaNumeros(nombre)) {
            this.nombre = nombre;
        }else{
            throw new NombreOApellidoNoValidoException(Mensaje.Usuario.APELLIDO_O_NOMBRE_NO_VALIDO);
        }
    }

    public String getApellido() {
        return apellido;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo)throws CorreoNoValidoException{
        if(validarCorreo()) {
            this.correo = correo;
        }else{
            throw new CorreoNoValidoException(Mensaje.Usuario.CORREO_NO_VALIDO);
        }
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setApellido(String apellido)throws NombreOApellidoNoValidoException {
        if(validarCadenaNoContengaNumeros(apellido)) {
            this.nombre = apellido;
        }else{
            throw new NombreOApellidoNoValidoException(Mensaje.Usuario.APELLIDO_O_NOMBRE_NO_VALIDO);
        }
    }

    public boolean validarCadenaNoContengaNumeros(String cadena){
        boolean cadenaEsValida = false;
        if(cadena.matches("[a-zA-Z]+")){
            cadenaEsValida = true;
        }
        return cadenaEsValida;

    }

    public boolean validarCorreo(){
        boolean correoValido = false;
        if(correo.contains("@") && correo.contains(".com")){
            correoValido = true;
        }
        return correoValido;
    }

    public boolean validarClave(){
        boolean claveSegura;
        claveSegura = false;
        if(clave.contains("[0-9]")){
            claveSegura = true;
        }
        return claveSegura;
    }
}
