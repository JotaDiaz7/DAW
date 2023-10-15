import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        int n;

        Scanner sc = new Scanner(System.in);

        //Pedimos al programa introducir el número de asteriscos
        System.out.print("Introduce un número de asteriscos: ");
        n = sc.nextInt();

        //Usamos bucle for para crear el número de flias
        for(int i = 0; i < n; i++){

            //Anidamos bucle for para crear el número de columnas
            for (int c = 1; c <= i; c++){
                System.out.print("* ");
            }
            System.out.println("*");
        }
    }
}
