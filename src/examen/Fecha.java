package examen;
/**
 * Programa que sirve para comprar si el formato de las fechas es correcto o no
 * @author daw1xx
 * @version v1
 */

public class Fecha {
	public static boolean fechaValida;
	/**
	 * Este booleano se encarga de decirnos si la fecha es valida o no
	 * @param fechaValida
	 * */
	
	/**
	 * Este valor es el dia de la fecha que introducacmos tiene q ser mayor de 0 y menor de 31. En caso de que sea febrero este tendra un maximo de 28 dias.
	 * @param dia 
	 * 
	 * Este valor es el mes de la fecha que introducacmos tiene q ser mayor de 0 y menor de 12. Los meses pares podran tener 30 dias y los impares 31.
	 * @param mes
	 * 
	 * Este valor es el anio de la fecha que introducacmos tiene q ser mayor de 0.
	 * @param anio
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}