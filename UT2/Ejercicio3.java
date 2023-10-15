import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        int num = 0;
        //Fórmula para crear el número secreto
        int secreto = 1 + (int) (Math.random() * 100);

        //System.out.println(secreto);

        Scanner sc = new Scanner(System.in);

        //Pedimos al programa introducir un número
        System.out.println("Tienes que introducir un número entre el 1 y el 100 para adivinar el número secreto, o -1 para rendirte");

        //Hacemos un bucle do-while para volver a dar otro intento en caso de no coincidir o no sea -1
        do{
            System.out.print("Introduce el número: ");
            num = sc.nextInt();

            //Creamos condicional if para lanzar avisos al usuario
            if(num == -1) {
                System.out.println("Lástima... el número secreto era " + secreto);
            }else if(num > secreto){
                System.out.println("El número que has introducido es mayor que el número secreto");
            }else if(num < secreto){
                System.out.println("El número que has introducido es menor que el número secreto");
            }else{
                System.out.println("¡Enhorabuena has acertado!");
            }

        }while (num != secreto && num != -1);
    }
}
