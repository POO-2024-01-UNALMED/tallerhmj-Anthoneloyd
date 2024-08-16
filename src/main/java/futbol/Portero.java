package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    public boolean jugarConLasManos() {
        return true;
    }

    public int compareTo(Portero portero) {
        if (this.getGolesRecibidos () > portero.getGolesRecibidos()) {
            return this.getGolesRecibidos() - portero.getGolesRecibidos();
        } else {
            return portero.getGolesRecibidos() - this.getGolesRecibidos();
        }
    }

    public String toString() {
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() + " con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;
    }

    // Getters y setters

    public short getGolesRecibidos() {
        return golesRecibidos;
    }
    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public byte getDorsal() {
        return dorsal;
    }
    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
