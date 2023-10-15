import java.util.Scanner;
public class Ejericio1 {
    public static void main(String[] args){
        int day, month;

        Scanner sc = new Scanner(System.in);

        //Pedimos al programa introducir un día
        System.out.print("Por favor, introduzca un día: ");
        day = sc.nextInt();

        //Pedimos al programa introducir un mes
        System.out.print("Por favor, introduzca el número de un mes: ");
        month = sc.nextInt();

        //Creamos condicional switch para saber si el mes es correcto o no
        if (month > 0 && month < 13) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    //Creamos condicional if para saber si el día es correct0 o no
                    if (day <= 0 || day > 31) {
                        System.out.println("¡Fecha incorrecta!");
                    } else {
                        System.out.println("Fecha válida: " + day + "/" + month);
                    }
                    break;
                case 2:
                    if (day <= 0 || day > 29) {
                        System.out.println("¡Fecha incorrecta!");
                    } else {
                        System.out.println("Fecha válida: " + day + "/" + month);
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day <= 0 || day > 30) {
                        System.out.println("¡Fecha incorrecta!");
                    } else {
                        System.out.println("Fecha válida: " + day + "/" + month);
                    }
                    break;
            }
        } else {
            System.out.println("¡Fecha incorrecta!");
        }
    }
}
