import java.util.Scanner;

public class IceCream {
    public static void main(String[] args) {
        
        //Vamos a hacer un programa que haga un pedido online por cada helado ordenado, vamos a escoger cuantas bolas de helado le pondremos y sus sabores.

        //Ejemplo de como debe mostrarse en la terminal:
        /* 
            ¿Cuántas bolas de helado quieres?: 3

            ¡Perfecto! Ahora escoge de que sabor quieres cada helado: 
                0. Chocolate
                1. Fresa
                2. Vainilla

            ¡Gracias por tu orden! Has pedido los siguientes sabores:
                0. Chocolate
                1. Fresa
                2. Vainilla
            
            ¿Es correcto? presiona cualquier tecla para continuar

            ¡Listo, tenemos tu orden! Acércate al mostrador y Robotina te entregará tu helado
        */

        // La cantidad y los sabores escoge el usuario

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many scoops of ice cream do you want?: ");
        byte scoops = scanner.nextByte();
        scanner.nextLine();
        System.out.println();

        //Los índices 0, 1 y 2 (y los que sean) no lo escribirá el usuario, saldrá automáticamente según la cantidad de bolas de helado que haya escogido el usuario. Primero saldrá 0. y esperará a que el usuario escriba el primer sabor y después del "enter" aparecerá el 1. para que el usuario escriba el segundo sabor y así sucesivamente.
        //Has de usar un array para almacenar los sabores de helado y un bucle para imprimirlos.
        //Mira en el ejemplo los saltos de línea que has de tener.

        System.out.println("Perfect! Now choose which flavor you want for each ice cream:");

        String[] flavors = new String[scoops];
        for (byte i = 0; i < scoops; i++){
            System.out.print(i + ". ");
            flavors[i] = scanner.nextLine();
        }

        System.out.println();

        byte counter = 0;
        System.out.println("Thank you for your order! You have ordered the following flavors: ");
        for(String flavour : flavors){
            System.out.println(counter + ". " + flavour);
            counter++;
        }

        System.out.println();

        System.out.println("Is this correct? Press any key to continue.");
        scanner.nextLine();

        System.out.println("Ready, we have your order! Come to the counter and Robotina will deliver your ice cream.");

        scanner.close();
    }
} 