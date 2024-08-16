package futbol;

public abstract class Futbolista implements Comparable {
    private String nombre;
    private int edad;
    private final String posicion;

    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public String toString() {
        return "El futbolista " + this.nombre + " tiene " + this.edad + ", y juega de " + this.posicion;
    }


    public boolean equals(Futbolista furbo1, Futbolista furbo2) {
        return furbo1.nombre.equals(furbo2.nombre) && furbo1.edad == furbo2.edad;
    }

    public abstract boolean jugarConLasManos();

    // Getters y setters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }
}
