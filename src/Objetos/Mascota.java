package Objetos;

/**
 *
 * @author Manzano
 */
public class Mascota {

    private String Nombre_Mascota;
    private String Especie;
    private String Raza;
    private String Sexo;
    private String Edad_Mascota;
   

    private Cliente Custumer; // Asignacion de Cliente a Mascota

    public Mascota() {

        this.setNombre_Mascota("none");
        this.setEspecie("none");
        this.setRaza("none");
        this.setSexo("None");
        this.setEdad_Mascota("none");
        
        Custumer = new Cliente();

    }

    public Mascota(String Nombre_Mascota, String Especie, String Raza, String Sexo, String Edad_Mascota,Cliente C) {

        this.Nombre_Mascota = Nombre_Mascota;
        this.Especie = Especie;
        this.Raza = Raza;
        this.Edad_Mascota = Edad_Mascota;
      

        Custumer = new Cliente();
        Custumer = C;
    }

    public String getNombre_Mascota() {
        return Nombre_Mascota;
    }

    public final void setNombre_Mascota(String Nombre_Mascota) {
        this.Nombre_Mascota = Nombre_Mascota;
    }

    public String getEspecie() {
        return Especie;
    }

    public final void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public String getRaza() {
        return Raza;
    }

    public final void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getSexo() {
        return Sexo;
    }

    public final void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEdad_Mascota() {
        return Edad_Mascota;
    }

    public final void setEdad_Mascota(String Edad_Mascota) {
        this.Edad_Mascota = Edad_Mascota;
    }

    //relaciones
    public void AsignaUsuario(Cliente c) {
        this.Custumer = c;
    }

    public String getNombreCliente() {
        return this.Custumer.getNombre();
        //Regresa el nombre del usuario
    }

}
