package ui;
import static ui.UItelevisores.*;
import static ui.UIneveras.*;
import java.util.Scanner;



public class UiMenu {
    /**
     * Metodo Menu Princial
     * Se genera para el interfas del usuario
     * */
    public static void showMenu() {
        int salir = 0;
        do{
            System.out.println("Bienvenido a tu gestor de facturación");
            System.out.println("Por favor ecoger de la opción del 1 al 2");
            System.out.println("01. Gestionar ingreso de Televisores");
            System.out.println("02. Gestionar ingreso de Neveras");
            System.out.println("00. Salir");

            Scanner sc = new Scanner(System.in);
            salir = Integer.valueOf(sc.nextLine());

            switch (salir) {
                case 1:
                    System.out.println("Inventario Televisores");
                    showMenuTelevisores();
                    break;
                case 2:
                    System.out.println("Inventario Neveras");
                    showMenuNeveras();
                    break;
                default:
                    System.out.println("Por favor escoge una de las opciónes");
                    break;
            }
        }while(salir != 0);
    }
}
