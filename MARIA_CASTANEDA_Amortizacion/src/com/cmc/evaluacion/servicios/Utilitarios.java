package com.cmc.evaluacion.servicios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Utilitarios {
	//Es metodo es util para mostrar los valores
	public static String redondearConDecimalFormat(double valor) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(valor);
    }
	
	//Este metodo es mas preciso para calculos
	public static double redondearConBigDecimal(double valor) {
        BigDecimal bd = new BigDecimal(valor);
        bd = bd.setScale(2, RoundingMode.HALF_UP); // Redondeo a 2 decimales
        return bd.doubleValue();
    }
}
