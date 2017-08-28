package Objetos;

/*
 * @author Manzano
 */
public class Persona {

    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Telefono;

    public Persona() {

        this.setNombre("Jorge");
        this.setApellido("Manzano");
        this.setDireccion("Volcan de fuego #2340 int 8");
        this.setTelefono("3334586668");

    }

    public Persona(String Nombre, String Apellido, String Direccion, String Telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public final void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public final void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public final void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public final void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

}
