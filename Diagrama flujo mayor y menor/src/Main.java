import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int valA;
        int valB;
        int valC;
        int valMayor;
        int valMenor;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su valor A");
        valA = scanner.nextInt();

        System.out.println("Ingrese su valor B");
        valB = scanner.nextInt();

        System.out.println("Ingrese su valor C");
        valC = scanner.nextInt();

        if (valA != valB && valA != valC && valB != valC) {
            System.out.println("¡Todos los valores con diferentes!");

            valMayor = valA;
            valMenor = valA;

            if (valB>valMayor){
                valMayor = valB;
            }
            if (valC>valMayor){
                valMayor = valC;
            }
            if (valB<valMenor){
                valMenor = valB;
            }
            if (valC<valMenor){
                valMenor = valC;
            }
            System.out.println("El valor menor es "+valMenor);
            System.out.println("El valor mayor es "+valMayor);

        } else {
            System.out.println("Los 3 valores deben ser distintos");
        }
    }
}