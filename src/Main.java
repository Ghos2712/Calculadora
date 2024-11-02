import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Introduceme si quieres restar o si quieres sumar");
        Scanner scanner = new Scanner(System.in);
        String mesa = scanner.nextLine() ;
        if (mesa.equals("sumar")){
            System.out.println("Introduce el primer numero");
            int numero1 = scanner.nextInt() ;


            System.out.println("Introduce el segundo numero");
            int numero2= scanner.nextInt() ;
            int resultado= numero1+numero2 ;

            System.out.println("La suma " + numero1+ " mas " + numero2+" es igual a "+ resultado) ;

        } else if (mesa.equals("restar")) {
            System.out.println("Inserte el primer numero");
            int number1= scanner.nextInt() ;
            System.out.println("inserte el segundo numero" );
            int number2=scanner.nextInt() ;
            int resultado= number1-number2 ;
            System.out.println(" la resta "+number1+ " mas "+ number2+ " es igual a "+ resultado);


        }
    }
}