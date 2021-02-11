package model;

public class Televisores extends Electrodomestico{
    private int pulgadas;
    //Generamos Constructor
    public Televisores(int id, String name, String consumo, int precio, String procedencia, int pulgadas) {
        super(id, name, consumo, precio, procedencia);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }
}
