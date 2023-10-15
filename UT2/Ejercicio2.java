import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        double a, b, c, raiz, sol1, sol2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el valor de a: ");
        a = sc.nextDouble();
        System.out.print("Introduzca el valor de b: ");
        b = sc.nextDouble();
        System.out.print("Introduzca el valor de c: ");
        c = sc.nextDouble();

        //Si el usuario introduce el valor de a (denominador) como 0
        if(a == 0){
            System.out.println("El doninador no puede ser 0");

        //Si el usuario introduce el valores que den como resultado de la raiz negativo
        }else if(4*a*c > b*b){
            System.out.println("La raiz no puede ser negativa");
        }else{
            //Calculamos la raiz
            raiz = Math.sqrt(Math.pow(b,2)-(4*a*c));
            //System.out.println(raiz);

            //Posible primera solución
            sol1 = (-b + raiz) / (2 * a);
            System.out.println("Primera solución: " + sol1);

            //Posible segunda solución
            sol2 = (-b - raiz) / (2 * a);
            System.out.println("Segunda solución: " + sol2);
        }

    }
}
