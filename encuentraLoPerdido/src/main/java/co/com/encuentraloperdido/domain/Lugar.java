package co.com.encuentraloperdido.domain;


import co.com.encuentraloperdido.bussinesexception.lugar.PrefijoDireccionNoValidoException;
import co.com.encuentraloperdido.message.Mensaje;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Lugar {

    private Long idLugar;
    private String descripcionLugar;
    private String direccion;

    public Lugar(Long idLugar, String descripcionLugar,String direccion)throws PrefijoDireccionNoValidoException{
        this.setIdLugar(idLugar);
        this.setDescripcionLugar(descripcionLugar);
        this.setDireccion(direccion);
        if(!validarIntegridadDatos() ){
            throw new PrefijoDireccionNoValidoException(Mensaje.Lugar.PREFIJO_DIRECCION_NO_VALIDO);
        }

    }


    public boolean validarIntegridadDatos(){
        boolean datosValidos;
        datosValidos = false;
        if(validarPrefijoDireccion() && !validarNulos() ){
            datosValidos = true;
        }
        return datosValidos;
    }

    public boolean validarPrefijoDireccion(){

        boolean prefijoValido = false;

        if(direccion.contains("Cll") || direccion.contains("Crr") && direccion.contains("#")){
            prefijoValido = true;

        }
        return prefijoValido;

    }

    public boolean validarNulos(){
        boolean hayNulos;
        hayNulos = true;
        System.out.println(direccion+" "+ descripcionLugar);
        if(direccion != null && descripcionLugar !=null  && !direccion.isEmpty() && !direccion.trim().isEmpty() &&
                !descripcionLugar.isEmpty() && !descripcionLugar.trim().isEmpty() ){
            hayNulos =false;
        }
        System.out.println(hayNulos);
        return hayNulos;
    }

}
