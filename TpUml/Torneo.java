public class Torneo {
    TFecha fecha;
    String ciudad;
    String aperturaUsada;
    double puntajeObtenido;
    String nombreContrincante;

    // Constructores
    public Torneo(TFecha fe, String ci, String apeUsa, double ptoObt,
            String nomC) {
        this.fecha = fe;
        this.ciudad = ci;
        this.aperturaUsada = apeUsa;
        this.puntajeObtenido = ptoObt;
        this.nombreContrincante = nomC;
    }

    // Observadores
    public TFecha getFecha() {
        return fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getAperturaUsada() {
        return aperturaUsada;
    }

    public double getPuntajeObtenido() {
        return puntajeObtenido;
    }

    public String getNombreContrincante() {
        return nombreContrincante;
    }

    // Modificadores
    public void setFecha(TFecha fecha) {
        this.fecha = fecha;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setAperturaUsada(String aperturaUsada) {
        this.aperturaUsada = aperturaUsada;
    }

    public void setPuntajeObtenido(double puntajeObtenido) {
        this.puntajeObtenido = puntajeObtenido;
    }

    public void setNombreContrincante(String nombreContrincante) {
        this.nombreContrincante = nombreContrincante;
    }

    // Propios del tipo
    @Override
    public boolean equals(Object obj) {
        return this == obj ||
                (obj instanceof Torneo &&
                        this.fecha.equals(((Torneo) obj).fecha) &&
                        this.ciudad.equals(((Torneo) obj).ciudad) &&
                        this.aperturaUsada.equals(((Torneo) obj).aperturaUsada) &&
                        this.puntajeObtenido == ((Torneo) obj).puntajeObtenido &&
                        this.nombreContrincante.equals(((Torneo) obj).nombreContrincante));
    }
}
