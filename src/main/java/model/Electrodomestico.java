package model;

public abstract class Electrodomestico {
    private int id;
    private String name;
    private int consumo;
    private double precio;
    private int procedencia;

    public Electrodomestico(int id, String name, int consumo, double precio, int procedencia) {
        this.id = id;
        this.name = name;
        this.consumo = consumo;
        this.precio = precio;
        this.procedencia = procedencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(int procedencia) {
        this.procedencia = procedencia;
    }

    public void show(){
        System.out.println("El id es "+ id + " el nombre es " + name + " Su valor es " + precio);
    }

    public void total(){
        System.out.println(precio);
    }
}
