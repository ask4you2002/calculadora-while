

/**
 * Write a description of class CalculadoraWhile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalculadoraWhile
{

    /**
     * Constructor for objects of class CalculadoraWhile
     */
    public CalculadoraWhile()
    {

    }

    public void multiplosDeCinco(){
        int index = 15;
        while (index < 95) {
            System.out.println(index);
            index = index + 5;
        }
    }

    public void sumaDeValores() {
        int index = 0;
        int total = 0;
        while ( index < 10) {
            index ++;
            total = total + index;
        }
        System.out.println(total);
    }

    public int sumaDeValoresEnElIntervalo(int a, int b) {
        int valorADevolver = -1;
        int index = 0;
        int total = 0;
        if (b < a) {
            int x = 0;
            x = a;
            a = b;
            b = x;
        }
        if ( a == b ) {
            total = a;
        }
        if ((a >= 0) && (b >= 0)) {
            index = a;
            total = a;
            while (! (index == b) ) {
                index ++;
                total = total + index;
            }
            valorADevolver = total;
        } else {
            System.out.println("a o b no puede ser negativos");
        }
        return valorADevolver;
    }
    public boolean esPrimo(int n) {
        boolean esPrimo = true;
        if ( n > 1 ) {
            int index = 2;
            while ( ( index < n ) && ( esPrimo == true ) ) {
                int resto = n % index ;
                if (resto == 0 ) {
                    esPrimo = false;
                }
                index ++;
            }
        } else {
            System.out.println("numero no puede ser < 1");
            esPrimo = false;
        }
        return esPrimo;
    }
}

