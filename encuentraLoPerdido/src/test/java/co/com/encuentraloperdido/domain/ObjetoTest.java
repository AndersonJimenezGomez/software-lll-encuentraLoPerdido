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

    @Test
    public void insertaFechaValida() throws ParseException {
        Objeto objeto = new Objeto();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-DD-YYYY");
        objeto.setFecha(sdf.parse("9-12-2019"));
        Assert.assertTrue(objeto.validarFecha());

    }

    @Test
    public void insertarFechaInvalida() throws ParseException {
        Objeto objeto = new Objeto();
        //LocalDate today = LocalDate.of(2019,9,12);
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2019);
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH,30);
        Date date = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");

        objeto.setFecha( sdf.parse(sdf.format(date)));
        Assert.assertFalse(objeto.validarFecha());

    }
}