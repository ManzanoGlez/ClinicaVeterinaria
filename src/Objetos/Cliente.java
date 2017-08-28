package Objetos;

/*
 * @author Manzano
 */
public class Cliente extends Persona {

    private String Correo_Electronico;
    private String RFC;
    private String FechaRegistro;
    private int Num_Mascotas;

    public Cliente() {

        this.setCorreo_Electronico("jorge_manzano24@hotmail.com");
        this.setRFC("MANG951219NQG1");
        this.setFechaRegistro("none");
        this.setNum_Mascotas(0);

    }

    public Cliente(String Nombre, String Apellido, String Correo_Electronico, String RFC, String FechaRegistro, String Direccion, String Telefono, int Num_Mascotas) {
        super(Nombre, Apellido, Direccion, Telefono);
        this.Correo_Electronico = Correo_Electronico;
        this.RFC = RFC;
        this.FechaRegistro = FechaRegistro;
        this.Num_Mascotas = Num_Mascotas;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public final void setCorreo_Electronico(String Correo_Electronico) {
        this.Correo_Electronico = Correo_Electronico;
    }

    public String getRFC() {
        return RFC;
    }

    public final void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getFechaRegistro() {
        return FechaRegistro;
    }

    public final void setFechaRegistro(String FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }
    
    
    public int getNum_Mascotas() {
        return Num_Mascotas;
    }

    public final void setNum_Mascotas(int Num_Mascotas) {
        this.Num_Mascotas = Num_Mascotas;
    }


}
