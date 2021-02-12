package ui;

import model.Electrodomestico;
import model.Neveras;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

import static ui.UiMenu.showMenu;

public class UIneveras {
    public static ArrayList<Electrodomestico>  neveraNew = new ArrayList<Electrodomestico>();

    public static void showMenuNeveras() {
        int salir = 0;
        while (salir != 1) {
            System.out.println("Menu Neveras");
            System.out.println("01. Ingresar Una o Mas neveras");
            System.out.println("02. ver lista de neveras");
            System.out.println("00. Volver al menu anterior");
            Scanner sc = new Scanner(System.in);
            salir = Integer.valueOf(sc.nextLine());
            switch (salir) {
                case 1:
                    ingresandoTelevisores();
                    break;
                case 2:
                    totalList();
                    break;
                case 0:
                    showMenu();
                default:

            }

        }
    }

    private static void ingresandoTelevisores() {


        System.out.println("Cuantos Neveras Va ingresar");
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

            System.out.println("Ingrese el tipo de consumo: ");
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
                importacionNoIRespuesta = 350000;
            } else if (importacionNoI == 2) {
                importacionNoIRespuesta = 200000;
            }

            System.out.println("Ingresar la capacidad de litros ");
            int litros = 0;
            int litrosRespuesta = 0;
            Scanner sclitros = new Scanner(System.in);
            litrosRespuesta = Integer.valueOf(sclitros.nextLine());
            if(litrosRespuesta>=120){
                litros = Math.round((litrosRespuesta-120)/10);
            }


            //Calculamos el precio
            double precioTotal = 0;
            precioTotal = (consumoRespuesta + importacionNoIRespuesta);
            precioTotal = Math.round(precioTotal*((litros*0.05)+1));

            Electrodomestico neveraNewElectrodomestico = new Neveras(idTV, marcaTV, consumoRespuesta, precioTotal, importacionNoIRespuesta, litrosRespuesta);
            neveraNew.add(neveraNewElectrodomestico);
            neveraNew.get(i).show();
        }

        }

        static void totalList(){
            System.out.println("\n");
            for (int i = 0; i < neveraNew.size(); i++) {
                neveraNew.get(i).show();
            }
        }
}
