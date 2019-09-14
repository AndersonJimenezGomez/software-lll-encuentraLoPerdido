package co.com.encuentraloperdido.domain;

import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Data
public class Objeto {

    private Long idObjeto;
    private String descripcion;
    private Date fecha;

    public boolean validarFecha(String fechaAValidar){

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(fecha);
        boolean fechaValida;
        fechaValida = true;
        String[] fecha ;
        fecha = fechaAValidar.split(" ");
        if (!calendar.getTime().toString().contains(fecha[0]) || !calendar.getTime().toString().contains(fecha[1])||!calendar.getTime().toString().contains(fecha[2])){
            fechaValida = false;
        }
        return fechaValida;

    }
}
