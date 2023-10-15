import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        double nota = 0;
        //Vamos a declarar una variable boolean para detectar el suspenso, a ver si así funciona esto...
        boolean suspenso = true;

        Scanner sc = new Scanner(System.in);

        //Hacemos un bucle for para pedir cinco notas
        for (int i = 0; i <= 4; i++) {

            //Ponemos el bucle do-while por si el usuario introduce una nota menor a uno o mayor a 10
            do {
                System.out.print("Introduce tu nota: ");
                nota = sc.nextDouble();

                //Aviso de nota incorrecta
                if (nota < 1 || nota > 10){
                    System.out.println("El rango de notas siempre es de 1-10. Vuelvo a introducirla.");
                }

            }while (nota < 1 || nota > 10);

            //Detectamos el suspenso
            if (nota < 5) {
                suspenso = false;
                // Finaliza la ejecución del bucle
                break;
            }
        }

        //Para asegurarme de que la lógica boolean me ha funcionado
        //System.out.println(suspenso);

        //Lanzamos mensaje
        if(suspenso){
            System.out.println("¡Todos han aprobado!");
        }else{
            System.out.println("Al menos hay un suspenso");
        }
    }
}
