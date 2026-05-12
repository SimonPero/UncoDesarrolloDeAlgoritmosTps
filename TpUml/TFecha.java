public class TFecha {

    private int dia;
    private int mes;
    private int anio;

    // Constructores
    public TFecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // Observadores
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    // Propios del tipo
    public boolean esValido() {

        if (anio <= 0)
            return false;
        if (mes < 1 || mes > 12)
            return false;

        int diasMes;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasMes = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = 30;
                break;
            case 2:
                if (esBisiesto()) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
                break;
            default:
                return false;
        }

        return dia >= 1 && dia <= diasMes;
    }

    public boolean esBisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj ||
                (obj instanceof TFecha &&
                        this.dia == ((TFecha) obj).dia &&
                        this.mes == ((TFecha) obj).mes &&
                        this.anio == ((TFecha) obj).anio);
    }
}