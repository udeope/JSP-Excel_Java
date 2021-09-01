package utilerias;

import java.text.SimpleDateFormat;
import java.util.*;

public class Conversiones {
    private static final String FORMATO_FECHA = "dd-MM";
    
    public static String format(Date fecha){
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
        return formateador.format(fecha);
    }
}
