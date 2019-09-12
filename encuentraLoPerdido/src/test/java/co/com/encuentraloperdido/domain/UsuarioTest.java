package co.com.encuentraloperdido.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsuarioTest {

    @Test
    public void insertarNombreNoValido() {
        Usuario usuario = new Usuario();
        usuario.setNombre("andr3s");
        Assert.assertFalse(usuario.validarCadenaNoContengaNumeros(usuario.getNombre()));
    }

    @Test
    public void insertarNombreValido(){
        Usuario usuario = new Usuario();
        usuario.setNombre("andres");
        Assert.assertTrue(usuario.validarCadenaNoContengaNumeros(usuario.getNombre()));
    }

    @Test
    public void validarCorreoValido(){
        Usuario usuario = new Usuario();
        usuario.setCorreo("andres123@gmail.com");
        Assert.assertTrue(usuario.validarCorreo());
    }

    @Test
    public void validarCorreoInValido(){
        Usuario usuario = new Usuario();
        usuario.setCorreo("andres123@gmail");
        Assert.assertFalse(usuario.validarCorreo());
    }
}