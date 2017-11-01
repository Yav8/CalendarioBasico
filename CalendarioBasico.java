
/**
 * CalendarioBásico
 *
 * @autor (Javier de Cea Domínguez)
 * @version (31-10-2017)
 */
public class CalendarioBasico {
    // Recoge el día.
    private int dia;
    // Recoge el mes.
    private int mes;
    // Recoge el año.
    private int ano;

    /**
     * Inicializa objetos con la siguiente fecha: día 01, mes 01, año 01.
     */
    public CalendarioBasico() {
        dia = 1;
        mes = 1;
        ano = 1;
    }

    /**
     * Fija el día, mes y año que deseemos.
     */
    public void fijarFecha(int fijaDia, int fijaMes, int fijaAno) {
        dia = fijaDia;
        mes = fijaMes;
        ano = fijaAno;
    }
}