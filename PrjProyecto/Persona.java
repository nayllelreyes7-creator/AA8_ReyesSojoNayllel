public class Persona implements Comparable {
    private String identificacion;
    private String nombreCompleto;
    private Proyecto miProyecto;

    public Persona(String id, String nombre) {
        identificacion = id;
        nombreCompleto = nombre;
    }

    public String getNombreCompleto() { return nombreCompleto; }

    public boolean menorQue(Comparable obj) {
        Persona otra = (Persona) obj;
        return this.getNombreCompleto().compareToIgnoreCase(otra.getNombreCompleto()) < 0;
    }

    public void asignarProyecto(Proyecto obj) {
        miProyecto = obj;
    }

    public double devolverCostoActualPrj() {
        return miProyecto.calcularCostoActual();
    }

    public String toString() {
        return "Identificación = " + identificacion +
               " Nombre Completo = " + nombreCompleto + "\n";
    }
}
