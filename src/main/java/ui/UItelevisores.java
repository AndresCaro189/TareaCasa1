package ui;

import model.Electrodomestico;
import model.Televisores;

import static ui.UiMenu.*;

import java.util.ArrayList;
import java.util.Scanner;

public class UItelevisores {
    public static ArrayList<Electrodomestico> teveNew = new ArrayList<Electrodomestico>();

    public static void showMenuTelevisores() {
        int salir = 0;
        while (salir != 1) {
            System.out.println("Menu Televisores");
            System.out.println("01. Ingresar Un nuevo Televisor");
            Scanner sc = new Scanner(System.in);
            salir = Integer.valueOf(sc.nextLine());
            switch (salir) {
                case 1:
                    ingresandoTelevisores();
                    break;
                case 0:
                    showMenu();
                default:

            }

        }
    }

    private static void ingresandoTelevisores() {


        System.out.println("Cuantos Televisores Va ingresar");
        int numTv = 0;
        Scanner sc = new Scanner(System.in);
        numTv = Integer.valueOf(sc.nextLine());


        for (int i = 0; i < numTv; i++) {
            System.out.println("Ingrese Id del producto: ");
            int idTV = 0;
            Scanner scId = new Scanner(System.in);
            idTV = Integer.valueOf(scId.nextLine());

            System.out.println("Ingrese la marca del producto: ");
            String marcaTV = "";
            Scanner scMarca = new Scanner(System.in);
            marcaTV = String.valueOf(scMarca.nextLine());

            System.out.println("Ingrese el tipo de consumo en mayuscula: ");
            System.out.println("1. $450000 ");
            System.out.println("2. $350000 ");
            System.out.println("3. $250000 ");
            int consumo = 0;
            int consumoRespuesta = 0;
            Scanner scConsumo = new Scanner(System.in);
            consumo = Integer.valueOf(scConsumo.nextLine());
            if (consumo == 1 ){
                consumoRespuesta = 450000;
            } else if (consumo == 2) {
                consumoRespuesta = 350000;
            }else if (consumo == 3) {
                consumoRespuesta = 250000;
            }

            System.out.println("Ingresar si es importado o nacional ");
            System.out.println("1. importado ");
            System.out.println("2. nacional ");
            int importacionNoI = 0;
            int importacionNoIRespuesta = 0;
            Scanner scimportacionNoI = new Scanner(System.in);
            importacionNoI = Integer.valueOf(scimportacionNoI.nextLine());
            if (importacionNoI == 1) {
                importacionNoIRespuesta = 250000;
            } else if (importacionNoI == 2) {
                importacionNoIRespuesta = 350000;
            }

            System.out.println("Ingresar las pulgadas del televisor en numeros");
            int pulgadas = 0;
            int pulgadasRespuesta = 0;
            Scanner scpulgadas = new Scanner(System.in);
            pulgadasRespuesta = Integer.valueOf(scpulgadas.nextLine());

            //Calculamos el precio
            double precioTotal = 0;
            precioTotal = consumoRespuesta + importacionNoIRespuesta;
            if (pulgadasRespuesta >= 40) {
                precioTotal = precioTotal*1.3;
            }

            Electrodomestico teveNewElectrodomestico = new Televisores(idTV, marcaTV, consumoRespuesta, precioTotal, importacionNoIRespuesta, pulgadasRespuesta);
            teveNew.add(teveNewElectrodomestico);
            teveNew.get(i).show();
        }
        System.out.println("\n");
        for (int i = 0; i < teveNew.size(); i++) {
            teveNew.get(i).show();
        }
    }
}


