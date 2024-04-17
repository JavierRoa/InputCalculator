import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    private static void inputThenPrintSumAndAverage() {
        long sum = 0;  // Creo variable para almacenar la suma de los inputs.
        long roundedAvg = 0;  // Creo variable para almacenar el promedio redondeado de sum.
        int count = 1;  // Creo variable de conteo.
        Scanner input = new Scanner(System.in);  // Instancio un nuevo objeto de clase Scanner.
        System.out.println("Enter a number, or any character to quit: ");  // Imprimo mensaje de introducción.
        // Uso bucle while, el cual en cada iteración:
        while(input.hasNextLong()) {
            System.out.println("Enter the next number, or any character to finish: ");  // Imprime el mensaje de continuación.
            long number = input.nextLong();  // Creo una variable para almacenar el valor del input.
            sum += number;  // Reasigno la variable sum con su propio valor + number.
            roundedAvg = Math.round((double) sum / count);  // Reasigno roundedAvg con el valor Math.round() de sum / count.
            count++;  // Aumento count en 1.
        }
        input.close();  // Cierro el Scanner
        System.out.println("SUM = " + sum + " AVG = " + roundedAvg);  // Imprimo mensaje final.
    }
}