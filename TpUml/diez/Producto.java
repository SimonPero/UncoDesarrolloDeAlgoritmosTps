package TpUml.diez;

public class Producto {

    private int codigo;
    private String descripcion;
    private double precioPorKilo;
    private double stockKilos;

    // Constructor vacío
    public Producto() {
    }

    // Constructor con parámetros
    public Producto(int codigo, String descripcion, double precioPorKilo, double stockKilos) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioPorKilo = precioPorKilo;
        this.stockKilos = stockKilos;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioPorKilo() {
        return precioPorKilo;
    }

    public double getStockKilos() {
        return stockKilos;
    }

    // Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioPorKilo(double precioPorKilo) {
        this.precioPorKilo = precioPorKilo;
    }

    public void setStockKilos(double stockKilos) {
        this.stockKilos = stockKilos;
    }

    // Método propio: calcular costo
    public double calcularCosto(double cantidad) {
        return cantidad * precioPorKilo;
    }

    // Método propio: restar stock
    public void restarStock(double cantidad) {
        if (cantidad <= stockKilos) {
            stockKilos -= cantidad;
        } else {
            System.out.println("Stock insuficiente.");
        }
    }
}