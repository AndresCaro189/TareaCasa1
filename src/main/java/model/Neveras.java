package model;

public class Neveras extends Electrodomestico{
    //Atrivutos
    private int capacidad;
    //Generamos Constructor
    public Neveras(int id, String name, int consumo, double precio, int procedencia,int capacidad) {
        super(id, name, consumo, precio, procedencia);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
