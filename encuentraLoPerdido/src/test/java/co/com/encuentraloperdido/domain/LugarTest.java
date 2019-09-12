package co.com.encuentraloperdido.domain;

import co.com.encuentraloperdido.bussinesexception.lugar.PrefijoDireccionNoValidoException;
import co.com.encuentraloperdido.message.Mensaje;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LugarTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void validarDireccionPrefijoValido(){
       Lugar lugar = new Lugar();
       lugar.setDireccion("Crr 50 #45 B 67");
       Assert.assertTrue(lugar.validarPrefijoDireccion());
    }

    @Test
    public void validarDireccionPrefijoInValido(){
        Lugar lugar = new Lugar();
        lugar.setDireccion("Cr 50 #45 B 67");
        Assert.assertFalse(lugar.validarPrefijoDireccion());
    }

    @Test
    public void crearInstanciaDireccionPrefijoInvalido()throws  PrefijoDireccionNoValidoException{
        exception.expect(PrefijoDireccionNoValidoException.class);
        exception.expectMessage(Mensaje.Lugar.PREFIJO_DIRECCION_NO_VALIDO);
        Lugar lugar = new Lugar((long)1,"casa vieja","C 50 45 B 67");
        lugar.validarIntegridadDatos();

    }

    @Test
    public void validarNulosDatosCompletos(){
        Lugar lugar = new Lugar();
        lugar.setDireccion("Crr 50 #45 B 67");
        lugar.setDescripcionLugar("casa vieja universidad");
        Assert.assertFalse(lugar.validarNulos());
    }

    @Test
    public void validarNulosDatosIncompletos(){
        Lugar lugar = new Lugar();
        lugar.setDireccion("Crr 50 #45 B 67");
        lugar.setDescripcionLugar("");
        Assert.assertTrue(lugar.validarNulos());
    }


    @Test
    public void validarIntegridadDatosInCorrectos(){
        Lugar lugar = new Lugar();
        lugar.setDireccion("Crr 50 #45 B 67");
        Assert.assertFalse(lugar.validarIntegridadDatos());
    }

    @Test
    public void validaraIntegridadDatosCorrectos(){
        Lugar lugar = new Lugar();
        lugar.setDireccion("Crr 50 #45 B 67");
        lugar.setDescripcionLugar("casa vieja universidad");
        Assert.assertTrue(lugar.validarIntegridadDatos());
    }


}