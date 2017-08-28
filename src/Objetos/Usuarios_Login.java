package Objetos;

/*
 * @author Manzano
 */
public class Usuarios_Login {

    private String Nombre_Usuario;
    private String Contraseña;


    public Usuarios_Login() {
        this.setNombre_Usuario("Admin");
        this.setContraseña("12345");
       

    }

    public Usuarios_Login(String Nombre_Usuario, String Contraseña) {
        this.Nombre_Usuario = Nombre_Usuario;
        this.Contraseña = Contraseña;
        
    }

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public final void setNombre_Usuario(String Nombre_Usuario) {
        this.Nombre_Usuario = Nombre_Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public final void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }


}
