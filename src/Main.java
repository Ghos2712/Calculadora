
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        String cal;
        System.out.println(" Introduceme si quieres restar sumar multiplicar o dividir ");
        Scanner scanner = new Scanner(System.in);
        cal = scanner.nextLine();
        while(!cal.equals("salir")) {



            if (cal.equals("sumar")) {
                System.out.println("empecemos la suma");
                System.out.println("Introduce un numero");
                int numero1 = scanner.nextInt();


                System.out.println("Introduce un numero");
                int numero2 = scanner.nextInt();
                int resultado = numero1 + numero2;

                System.out.println("La suma de " + numero1 + " mas " + numero2 + " es igual a " + resultado);

            } else if (cal.equals("restar")) {
                System.out.println("empecemos la resta");
                System.out.println("Introduce un numero");
                int number1 = scanner.nextInt();
                System.out.println("introduce un numero");
                int number2 = scanner.nextInt();
                int resultado = number1 - number2;
                System.out.println(" la resta de " + number1 + " menos " + number2 + " es igual a " + resultado);


            } else if (cal.equals("multiplicar")) {
                System.out.println("Empecemos la multiplicacion");
                System.out.println("introduce un numero");
                int numero3 = scanner.nextInt();
                System.out.println("introduce un numero");
                int numero4 = scanner.nextInt();
                int respuesta = numero3 * numero4;
                System.out.println(" la multiplicacion " + numero3 + " por " + numero4 + " es igual a " + respuesta);


            } else if (cal.equals("dividir")) {

                double numero6;
                do {
                    System.out.println("Empecemos la division");
                    System.out.println("intriduce un numero ");
                    double numero5 = scanner.nextInt();
                    System.out.println("introduce un numero");
                     numero6 = scanner.nextInt();
                    if (numero6 == 0) {
                        System.out.println("error, no se puede introducir 0 introduzca otro numero");

                    }else{

                        double respuesta = numero5 / numero6;
                        System.out.println(" la division " + numero5 + " entre " + numero6 + " es igual a  " + respuesta);

                        System.out.println("Gracias por su tiempo");
                    }




                } while (numero6 == 0);

            }
            System.out.println("Introduceme si quieres restar sumar multiplicar o dividir ");
            cal = scanner.nextLine();
            scanner.nextLine();
        };




    }
}