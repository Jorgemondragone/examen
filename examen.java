import java.util.Scanner;

public class examen {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a, b, resultado, respuesta;
        System.out.println("Ingrese el primer numero");
        a = obj.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = obj.nextInt();
        System.out.println("¿Que desea hacer con estos valores?");
        System.out.println("1._Suma 2._Resta 3._Multiplicacion 4._Divicion 5._Potencia 6._Salir");
        respuesta = obj.nextInt();
        operacion op = new operacion();

        switch (respuesta) {

            case 1:
                int suma = op.sumar(a, b);
                op.resultado1(suma);
                break;

            case 2:

                int resta = op.restar(a, b);
                op.resultado2(resta);
                break;

            case 3:

                int multiplicacion = op.multiplicar(a, b);
                op.resultado3(multiplicacion);
                break;

            case 4:

                int divicion = op.dividir(a, b);
                op.resultado4(divicion);
                break;

            case 5:

                int potencia = op.enecima(a, b);
                op.resultado5(potencia);
                break;

            default:
                System.out.println("ERROR");
                break;

        }

    }

}
