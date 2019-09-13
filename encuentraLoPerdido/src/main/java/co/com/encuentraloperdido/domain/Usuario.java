package co.com.encuentraloperdido.domain;

import co.com.encuentraloperdido.bussinesexception.usuario.ClaveInseguraException;
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

    public Usuario(Long idUsuario, String nombre, String apellido, String correo, String clave)throws NombreOApellidoNoValidoException, CorreoNoValidoException,ClaveInseguraException,CorreoNoValidoException {
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
        if(validarCadenaNoContengaNumeros(nombre) && validarNulos()) {
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
        if(validarCorreo(correo)&& validarNulos()) {
            this.correo = correo;
        }else{
            throw new CorreoNoValidoException(Mensaje.Usuario.CORREO_NO_VALIDO);
        }
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) throws ClaveInseguraException {
        if(validarClave(clave)&& validarNulos()){
            this.clave = clave;
        }else{
            throw new ClaveInseguraException(Mensaje.Usuario.CLAVE_NO_VALIDA);
        }

    }

    public void setApellido(String apellido)throws NombreOApellidoNoValidoException {
        if(validarCadenaNoContengaNumeros(apellido)&& validarNulos()) {
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

    public boolean validarCorreo(String correo){
        boolean correoValido = false;
        if(correo.contains("@") && correo.contains(".com")){
            correoValido = true;
        }
        return correoValido;
    }

    public boolean validarClave(String clave){
        boolean claveSegura;
        claveSegura = false;
        if(clave.matches("^[0-9]+[a-zA-Z0-9]+|[a-zA-Z0-9]+[0-9]+[a-zA-Z0-9]+|[a-zA-Z0-9]+[0-9]+$") && clave.length()>=8){
            claveSegura = true;
        }
        return claveSegura;
    }

    public boolean validarNulos(){
        boolean hayNulos;
        hayNulos = true;
        if(nombre !=null && !nombre.trim().isEmpty()  && apellido !=null && !apellido.trim().isEmpty()
                && correo !=null&& !correo.trim().isEmpty() && !clave.trim().isEmpty() && clave !=null){
            hayNulos = false;
        }
        return hayNulos;
    }


}
