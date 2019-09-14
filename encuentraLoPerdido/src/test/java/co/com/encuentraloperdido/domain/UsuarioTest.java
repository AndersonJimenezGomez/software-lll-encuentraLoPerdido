package co.com.encuentraloperdido.domain;

import co.com.encuentraloperdido.bussinesexception.usuario.ClaveInseguraException;
import co.com.encuentraloperdido.bussinesexception.usuario.CorreoNoValidoException;
import co.com.encuentraloperdido.bussinesexception.usuario.NombreOApellidoNoValidoException;
import co.com.encuentraloperdido.message.Mensaje;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class UsuarioTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();


    @Test
    public void insertarUsuarioNombreNoValido()throws NombreOApellidoNoValidoException{
        exception.expect(NombreOApellidoNoValidoException.class);
        exception.expectMessage(Mensaje.Usuario.APELLIDO_O_NOMBRE_NO_VALIDO);
        Usuario usuario = new Usuario();
        usuario.setNombre("Andr3s");
    }

    @Test
    public void insertatUsuarioNombreValido()throws NombreOApellidoNoValidoException{
        Usuario usuario = new Usuario();
        usuario.setNombre("Andres");
        Assert.assertEquals("Andres",usuario.getNombre());

    }

    @Test
    public void insertarUsuarioCorreoInValido()throws CorreoNoValidoException{
        exception.expect(CorreoNoValidoException.class);
        exception.expectMessage(Mensaje.Usuario.CORREO_NO_VALIDO);
        Usuario usuario = new Usuario();
        usuario.setCorreo("Andres123@hotmail");
    }

    @Test
    public void insertarUsuarioCorreoValido()throws  CorreoNoValidoException{
        Usuario usuario = new Usuario();
        usuario.setCorreo("Andres123@hotmail.com");
        Assert.assertEquals("Andres123@hotmail.com", usuario.getCorreo());
    }

    @Test
    public void validarClaveInsegura()throws ClaveInseguraException{
        exception.expect(ClaveInseguraException.class);
        exception.expectMessage(Mensaje.Usuario.CLAVE_NO_VALIDA);
        Usuario usuario = new Usuario();
        usuario.setClave("Andres");
    }

    @Test
    public void validarClaveSegura() throws ClaveInseguraException{
        Usuario usuario = new Usuario();
        usuario.setClave("Andres123123");
        Assert.assertEquals("Andres123123",usuario.getClave());

    }

    @Test
    public void validarDatosNulos(){
        Usuario usuario = new Usuario();
        boolean esNulo;
        esNulo = usuario.validarNulos();
        Assert.assertTrue(esNulo);
    }


}