package model;

public class Neveras extends Electrodomestico{
    //Atrivutos
    private int capacidad;
    //Generamos Constructor
    public Neveras(int id, String name, String consumo, int precio, String procedencia,int capacidad) {
        super(id, name, consumo, precio, procedencia);
        this.capacidad = capacidad;
    }

    public void ShowNeveras(){
        System.out.println("Por favor escoge una de las opciónes");
    }
}
