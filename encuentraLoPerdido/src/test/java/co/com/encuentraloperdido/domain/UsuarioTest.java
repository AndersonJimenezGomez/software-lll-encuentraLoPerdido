package co.com.encuentraloperdido.domain;

import co.com.encuentraloperdido.bussinesexception.usuario.ClaveInseguraException;
import co.com.encuentraloperdido.bussinesexception.usuario.CorreoNoValidoException;
import co.com.encuentraloperdido.bussinesexception.usuario.NombreOApellidoNoValidoException;
import co.com.encuentraloperdido.message.Mensaje;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class UsuarioTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void insertarUsuarioNombreInvalido()throws NombreOApellidoNoValidoException{
        exception.expect(NombreOApellidoNoValidoException.class);
        exception.expectMessage(Mensaje.Usuario.APELLIDO_O_NOMBRE_NO_VALIDO);
        Usuario usuario = new Usuario();
        usuario.setNombre("Andr3s");

    }

    @Test
    public void insertarUsuarioNombreValido()throws NombreOApellidoNoValidoException{
        Usuario usuario = new Usuario();
        usuario.setNombre("Andres");
    }

    @Test
    public void insertarClaveUsuarioValida() throws ClaveInseguraException{
        exception.expect(ClaveInseguraException.class);
        exception.expectMessage(Mensaje.Usuario.CLAVE_NO_VALIDA);
        Usuario usuario = new Usuario();
        usuario.setClave("andres");

    }


    @Test
    public void insertarUsuarioCorreoInvalido() throws CorreoNoValidoException{
        exception.expect(CorreoNoValidoException.class);
        exception.expectMessage(Mensaje.Usuario.CORREO_NO_VALIDO);
        Usuario usuario = new Usuario();
        usuario.setCorreo("andres@hotmail.com");
    }
    @Test
    public void validarCorreoValido()throws CorreoNoValidoException {
        Usuario usuario = new Usuario();
        usuario.setCorreo("andres123@gmail.com");
        Assert.assertTrue(usuario.validarCorreo());
    }

    @Test
    public void validarCorreoInValido()throws CorreoNoValidoException{
        Usuario usuario = new Usuario();
        usuario.setCorreo("andres123@gmail");
        Assert.assertFalse(usuario.validarCorreo());
    }

    @Test
    public void validarClaveSegura()throws ClaveInseguraException{
        Usuario usuario = new Usuario();
        usuario.setClave("dassdAqweqasda1");
        Assert.assertTrue(usuario.validarClave());
    }

    @Test
    public void validarClaveInsegura() throws ClaveInseguraException {
        Usuario usuario = new Usuario();
        usuario.setClave("dassd");
        Assert.assertFalse(usuario.validarClave());
    }

    @Test
    public void validarNombreIncorrecto(){
        Usuario usuario = new Usuario();
        usuario.setNombre("andr3s");
        Assert.assertFalse(usuario.validarCadenaNoContengaNumeros(usuario.getNombre()));
    }

    @Test
    public void validarNombreCorrecto(){
        Usuario usuario = new Usuario();
        usuario.setNombre("andres");
        Assert.assertTrue(usuario.validarCadenaNoContengaNumeros(usuario.getNombre()    ));
    }

    @Test
    public void validarDatosNulos(){
        Usuario usuario = new Usuario();
        usuario.setNombre(" ");
        usuario.setApellido(" ");
        usuario.setCorreo(" ");
        usuario.setClave(" ");
        Assert.assertTrue(usuario.validarNulos());
    }

    @Test
    public void validarDatosNoNulos(){
        Usuario usuario = new Usuario();
        usuario.setNombre("andres");
        usuario.setApellido("garcia");
        usuario.setCorreo("andres@hotmail.com");
        usuario.setClave("123321123");
        Assert.assertFalse(usuario.validarNulos());
    }
}