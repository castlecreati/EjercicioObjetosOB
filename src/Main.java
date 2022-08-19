public class Main {
    public static void main(String[] args) {
        Persona pepe = new Persona();
        pepe.setEdad(47);
        pepe.setNombre("Pepe");
        pepe.setTelefono("666666666");

        System.out.println("Esta persona es " + pepe.getNombre());
        System.out.println("Tiene " + pepe.getEdad() + " años");
        System.out.println("Su teléfono es " + pepe.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}