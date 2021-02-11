package model;

public abstract class Electrodomestico {
    private int id;
    private String name;
    private String consumo;
    private int precio;
    private String procedencia;

    public Electrodomestico(int id, String name, String consumo, int precio, String procedencia) {
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

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public void show(){
        System.out.println("Por favor escoge "+ name);
    }
}
