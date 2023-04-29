public class operacion {

    public int sumar(int a, int b) {
        int suma = a + b;
        return suma;
    }

    public int restar(int a, int b) {
        int resta = a - b;
        return resta;

    }

    public int multiplicar(int a, int b) {
        int multiplicacion = a * b;
        return multiplicacion;

    }

    public int dividir(int a, int b) {
        int divicion = a / b;
        return divicion;

    }

    public int enecima(int a, int b) {
        int potencia = (int) (Math.pow(a, b));
        return potencia;

    }

    public void resultado1(int suma) {
        System.out.println("La suma es: " + suma);

    }

    public void resultado2(int resta) {
        System.out.println("La resta es: " + resta);

    }

    public void resultado3(int multiplicacion) {
        System.out.println("La resta es: " + multiplicacion);

    }

    public void resultado4(int divicion) {
        System.out.println("La resta es: " + divicion);

    }

    public void resultado5(int potencia) {
        System.out.println("La potencia es: " + potencia);

    }

}