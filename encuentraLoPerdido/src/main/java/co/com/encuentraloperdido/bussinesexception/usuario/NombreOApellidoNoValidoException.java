package co.com.encuentraloperdido.bussinesexception.usuario;

import co.com.encuentraloperdido.bussinesexception.BusinessException;

public class NombreOApellidoNoValidoException extends BusinessException {

    public NombreOApellidoNoValidoException(String mensaje){
        super(mensaje);
    }
}
