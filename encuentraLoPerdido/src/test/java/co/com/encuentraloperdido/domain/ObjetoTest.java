package co.com.encuentraloperdido.domain;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

@SpringBootTest
public class ObjetoTest {

   /* @Test
    public void insertaFechaValida() throws ParseException {
        Objeto objeto = new Objeto();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-YYYY");
        objeto.setFecha(sdf.parse("9-12-2019"));
        Assert.assertTrue(objeto.validarFecha());

    }*/

    @Test
    public void insertarFechaInvalida() throws ParseException {
        Objeto objeto = new Objeto();
        objeto.setFecha(new Date("Feb 29 2015"));
        Assert.assertFalse(objeto.validarFecha("Feb 29 2015"));
    }

    @Test
    public void insertarFechaValida() throws ParseException {
        Objeto objeto = new Objeto();
        objeto.setFecha(new Date("Feb 29 2016"));
        Assert.assertTrue(objeto.validarFecha("Feb 29 2016"));
    }
}