package co.com.encuentraloperdido.message;

public class Mensaje {


    public class Lugar{
        public static final String PREFIJO_DIRECCION_NO_VALIDO ="El prefijo de la direccion no es valido";
    }

    public class Usuario{
        public static final String CLAVE_NO_VALIDA = "La clave no cumple con los requerimientos minimos de seguridad";
        public static final String APELLIDO_O_NOMBRE_NO_VALIDO = "Los nombres y apellidos no pueden contener numeros ni caracteres especiales";
        public static final String CORREO_NO_VALIDO = "El correo no es valido, debe contener '@' y '.com'";
    }

    public class Objeto{
        public static  final String FECHA_NO_VALIDA = "La fecha no es valida";
        public static  final String DESCRIPCION_NO_VALIDA = "La descripcion del objeto no es valida";

    }

    public class Publicacion{
        public static final String LUGAR_NO_VALIDO ="El lugar no es valido";
        public static final String OBJETO_NULO = "La publicacion debe contener un objeto";
    }


}
