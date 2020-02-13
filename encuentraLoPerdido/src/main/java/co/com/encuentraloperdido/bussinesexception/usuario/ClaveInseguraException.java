package co.com.encuentraloperdido.bussinesexception.usuario;

import co.com.encuentraloperdido.bussinesexception.BusinessException;

public class ClaveInseguraException extends BusinessException {
    public ClaveInseguraException(String mensaje){
        super(mensaje);
    }
}
