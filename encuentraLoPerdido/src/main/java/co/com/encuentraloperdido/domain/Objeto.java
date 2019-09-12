package co.com.encuentraloperdido.domain;

import lombok.Data;

import java.util.Date;
import java.util.GregorianCalendar;

@Data
public class Objeto {

    private Long idObjeto;
    private String descripcion;
    private Date fecha;

    public boolean validarFecha(){
        //abril,junio,septiembre,noviembre =30
        //enero,marzo,mayo,julio,agosto,octubre,diciembre = 31
        //febrero = 28 o 29

        int mes = fecha.getMonth();
        int dia = fecha.getDay();
        int año = fecha.getYear();

        int diasMeses [] = {31,28,31,30,31,30,31,31,30,31,30,31};

        boolean fechaValida;
        fechaValida = false;
        if(mes!=2 && diasMeses[mes]>=dia){
            fechaValida = true;
        }
        else if(año%4 ==0 && mes ==2 && dia<= 28){
            fechaValida = true;
        }

        return fechaValida;


    }
}
