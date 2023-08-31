import pkgPizza.base.Pizza;
import pkgPizza.base.Topping;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Creacion de las instancias de Pizza
        Pizza Margarita = new Pizza("Margarita", 8.0);
        Pizza Americana = new Pizza("Americana Clasica", 10);

        //Opciones de pizza para el usuario
        System.out.println("Selecciona la pizza que deseas");
        System.out.println("1. Pizza Margarita $8.0");
        System.out.println("2. Pizza Americana $10");

        //Esta es una instancia de scanner para leer la entrada del usuario
        Scanner scanner1 = new Scanner(System.in);

        int pizzaOption = scanner1.nextInt();
        Pizza selecionapizza;

        //Seleccion de la Pizza
        switch(pizzaOption){
            case 1:
                selecionapizza = Margarita;
                break;
            case 2:
                selecionapizza = Americana;
                break;
            default:
                System.out.println("Opcion no Valida, se tomara como opcion Pizza Americana");
                selecionapizza = Americana;
        }

        //Creacion de las instancias de Topping
        Topping tomato = new Topping("Tomato", 1.0);
        Topping cheese = new Topping("Cheese", 2.0);
        Topping pepperoni = new Topping("Pepperoni", 3.0);

        //Instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona los ingredientes para tu pizza:");
        System.out.println("1. Tomato $1");
        System.out.println("2. Cheese $2");
        System.out.println("3. Pepperoni $3");
        System.out.println("Presiona 0 para finalizar la selección.");


        int option;
        do {
            //Con este codigo se muestra la pizza con todos los ingredientes acutuales que tiene seleccionados
            System.out.println("Tu pizza actual: " + selecionapizza);
            System.out.print("Ingresa el número del ingrediente (0 para terminar): ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    selecionapizza.addTopping(tomato);
                    System.out.println("Se le agregó Tomate a la Pizza");
                    break;
                case 2:
                    selecionapizza.addTopping(cheese);
                    System.out.println("Se le agregó Cheese a la Pizza");
                    break;
                case 3:
                    selecionapizza.addTopping(pepperoni);
                    System.out.println("Se le agregó Pepperoni a la Pizza");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (option != 0);

        //Aqui se cierra el scanner
        scanner.close();

        for(int i = 0; i<5; i++){
            System.out.println("Tu pizza se está preparando");
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        //Aca se muestra la pizza con sus ingredientes finales el precio total
        System.out.println("");
        System.out.println("Tu pizza final:");
        System.out.println("");
        System.out.println(selecionapizza);


    }
}






