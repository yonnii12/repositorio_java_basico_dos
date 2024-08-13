import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int cal;

        System.out.println("Ingrese su calificacion");
        Scanner scanner = new Scanner(System.in);
        cal = scanner.nextInt();

        switch (cal){
            case 1:
            case 2:
                System.out.println("Su calificacion es: F");
                break;
            case 3:
            case 4:
                System.out.println("Su calificacion es: D");
                break;
            case 5:
            case 6:
                System.out.println("Su calificacion es: C");
                break;
            case 7:
            case 8:
                System.out.println("Su calificacion es: B");
                break;
            case 9:
            case 10:
                System.out.println("Su calificacion es: A");
                break;

            default:
                System.out.println("Número no válido, por favor verifique");
        }

    }
}