public class Socio {
    int codigo;
    String nombre;
    String apellido;
    int edad;
    Torneo[] torneos;

    // Constructores
    public Socio(String nom, String ape, int edad) {
        this.nombre = nom;
        this.apellido = ape;
        this.edad = edad;
        this.torneos = new Torneo[10];
    }

    public Socio(String nom, String ape, int edad, int cod, Torneo[] torneos) {
        this.nombre = nom;
        this.apellido = ape;
        this.edad = edad;
        this.codigo = cod;
        this.torneos = torneos;
    }
    // Observadores

    public int getCodgio() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getTorneosGanados() {
        int i = 0;
        while (i < 10 && torneos[i] != null) {
            i++;
        }
        return i;
    }

    public double getMayorPuntaje() {
        int i = 0;
        double max = -1000;
        while (i < 10 && torneos[i] != null) {
            double pto = torneos[i].getPuntajeObtenido();
            if (pto > max) {
                max = pto;
            }
            i++;
        }
        return max;
    }

    // Modificadores
    public void setCodgio(int cod) {
        this.codigo = cod;
    }

    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setApellido(String ape) {
        this.apellido = ape;
    }

    public void setTorneosGanados(int edad) {
        this.edad = edad;
    }

    public void setMayorPuntaje(double nvPto) {
        int i = 0;
        double max = -1000;
        int pos = 0;
        while (i < 10 && torneos[i] != null) {
            double pto = torneos[i].getPuntajeObtenido();
            if (pto > max) {
                max = pto;
                pos = i;
            }
            i++;
        }
        torneos[pos].setPuntajeObtenido(nvPto);
    }

    // Propios del tipo
    @Override
    public boolean equals(Object obj) {
        return this == obj ||
                (obj instanceof Torneo && this.codigo == ((Socio) obj).codigo);
    }

    public boolean agregarTorneo(Torneo t) {
        int i = 0;
        boolean res = false;
        boolean end = true;
        while (i < 10 && end) {
            if (torneos[i] != null && torneos[i].equals(t)) {
                end = false;
            } else if (torneos[i] == null) {
                torneos[i] = t;
                end = false;
                res = true;
            }
            i++;
        }
        return res;
    }
}
