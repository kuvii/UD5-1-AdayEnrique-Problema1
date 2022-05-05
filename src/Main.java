import Utils.CustomCollection;
import Utils.CustomQueue;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomQueue queue = new CustomQueue();
        float value;
        float suma = 0;
        String opcion = "'";
        while (!opcion.equals("Q")){
            System.out.println("Introduzca un valor: ");
            opcion = scanner.nextLine();
            if (!Objects.equals(opcion, "Q")){
                value = Float.parseFloat(opcion);
                queue.enqueue(value);
            }
        }
        System.out.println("elementos de la lista");
        queue.showAll();
        System.out.println(queue.sumAll());
    }
}
