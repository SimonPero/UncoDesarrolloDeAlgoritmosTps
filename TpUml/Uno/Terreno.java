package TpUml.Uno;

public class Terreno {
    int codigo;
    double base;
    double altura;
    int manzana;

    // Constructores
    public Terreno(int cod) {
        this.codigo = cod;
        this.base = 0;
        this.altura = 0;
    }

    public Terreno(int cod, double ba, double al, int man) {
        this.codigo = cod;
        this.base = ba;
        this.altura = al;
        this.manzana = man;
    }

    // Observadores
    public int getCodigo() {
        return this.codigo;
    }

    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    public int getManzana() {
        return this.manzana;
    }

    public String toString() {
        return "Terreno{" +
                "codigo=" + codigo +
                ", base=" + base +
                ", altura=" + altura +
                ", manzana=" + manzana +
                '}';
    }

    public boolean equals(Terreno ter) {
        boolean res = true;
        if (ter != this) {
            res = false;
        } else {
            res = res && ter.codigo == codigo && ter.base == base && ter.altura == altura && ter.manzana == manzana;
        }
        return res;
    }

    // Modificadores
    // + setCodigo (int cod)
    // + setBase (double ba)
    // + setAltura (double al)
    public void setCodigo(int cod) {
        this.codigo = cod;
    }

    public void setBase(double ba) {
        this.base = ba;
    }

    public void setAltura(double al) {
        this.base = al;
    }

    // Propias del tipo
    // + perimetro () : double
    // + superficie () : double
    // + valor (double precio) : double //ingresa el precio por metro cuadrado
    public double perimetro() {
        return 2 * this.base + 2 * this.altura;
    }

    public double superficie() {
        return this.base * this.altura;
    }

    public double valor(double precio) {
        return this.superficie() * precio;
    }
}
