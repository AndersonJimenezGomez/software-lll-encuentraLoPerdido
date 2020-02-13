package co.com.encuentraloperdido.bussinesexception.usuario;


import co.com.encuentraloperdido.bussinesexception.BusinessException;

public class CorreoNoValidoException extends BusinessException {

    public CorreoNoValidoException(String mensaje){
        super(mensaje);
    }
}
