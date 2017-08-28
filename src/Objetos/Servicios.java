package Objetos;

/**
 *
 * @author Manzano
 */
public class Servicios {

    private int Id_Servicio;

    private String Servicio_Consulta;
    private String Servicio_Vacuna;
    private String Servicio_Cirugia;
    private String Servicio_Desparasitacion;
    private String Servicio_Estetica;
    private String Servicio_Pension;

    private double Precio_Consulta;
    private double Precio_Vacuna;
    private double Precio_Cirugia;
    private double Precio_Desparasitacion;
    private double Precio_Estetica;
    private double Precio_Pension;

    private String FechaHistorialMascota;
    private double PrecioTotal;
    private String Descripcion;

    private double Descuento;

    private Cliente Custumer; /// Asignacion de cliente
    private Mascota m; // Asignacion de Mascota

    public Servicios() {

        this.setId_Servicio(0);

        this.setServicio_Consulta(null);
        this.setServicio_Vacuna(null);
        this.setServicio_Cirugia(null);
        this.setServicio_Desparasitacion(null);
        this.setServicio_Estetica(null);
        this.setServicio_Pension(null);

        this.setPrecio_Consulta(300.00);
        this.setPrecio_Vacuna(250.00);
        this.setPrecio_Cirugia(1999.00);
        this.setPrecio_Desparasitacion(250.00);
        this.setPrecio_Estetica(200.00);
        this.setPrecio_Pension(4500.00);
        this.setPrecioTotal(0.0);

        this.setDescuento(0.0);

        this.setFechaHistorialMascota(null);
        this.setDescripcion("None");

        Custumer = new Cliente();
        m = new Mascota();

    }

    public Servicios(int Id_Servicio, String Servicio_Consulta, String Servicio_Vacuna, String Servicio_Cirugia, String Servicio_Desparasitacion, String Servicio_Estetica, String Servicio_Pension, double Precio_Consulta, double Precio_Vacuna, double Precio_Desparasitacion, double Precio_Estetica, double Precio_Pension, String FechaHistorialMascota, double PrecioTotal, String Descripcion, double Descuento) {
        this.Id_Servicio = Id_Servicio;
        this.Servicio_Consulta = Servicio_Consulta;
        this.Servicio_Vacuna = Servicio_Vacuna;
        this.Servicio_Cirugia = Servicio_Cirugia;
        this.Servicio_Desparasitacion = Servicio_Desparasitacion;
        this.Servicio_Estetica = Servicio_Estetica;
        this.Servicio_Pension = Servicio_Pension;
        this.Precio_Consulta = Precio_Consulta;
        this.Precio_Vacuna = Precio_Vacuna;
        this.Precio_Desparasitacion = Precio_Desparasitacion;
        this.Precio_Estetica = Precio_Estetica;
        this.Precio_Pension = Precio_Pension;
        this.FechaHistorialMascota = FechaHistorialMascota;
        this.PrecioTotal = PrecioTotal;
        this.Descripcion = Descripcion;
        this.Descuento = Descuento;

        Custumer = new Cliente();
        m = new Mascota();
    }

    public int getId_Servicio() {
        return Id_Servicio;
    }

    public final void setId_Servicio(int Id_Servicio) {
        this.Id_Servicio = Id_Servicio;
    }

    public String getFechaHistorialMascota() {
        return FechaHistorialMascota;
    }

    public final void setFechaHistorialMascota(String FechaHistorialMascota) {
        this.FechaHistorialMascota = FechaHistorialMascota;
    }

    public String getServicio_Consulta() {
        return Servicio_Consulta;
    }

    public final void setServicio_Consulta(String Servicio_Consulta) {
        this.Servicio_Consulta = Servicio_Consulta;
    }

    public String getServicio_Vacuna() {
        return Servicio_Vacuna;
    }

    public final void setServicio_Vacuna(String Servicio_Vacuna) {
        this.Servicio_Vacuna = Servicio_Vacuna;
    }

    public String getServicio_Cirugia() {
        return Servicio_Cirugia;
    }

    public final void setServicio_Cirugia(String Servicio_Cirugia) {
        this.Servicio_Cirugia = Servicio_Cirugia;
    }

    public String getServicio_Desparasitacion() {
        return Servicio_Desparasitacion;
    }

    public final void setServicio_Desparasitacion(String Servicio_Desparasitacion) {
        this.Servicio_Desparasitacion = Servicio_Desparasitacion;
    }

    public String getServicio_Estetica() {
        return Servicio_Estetica;
    }

    public final void setServicio_Estetica(String Servicio_Estetica) {
        this.Servicio_Estetica = Servicio_Estetica;
    }

    public String getServicio_Pension() {
        return Servicio_Pension;
    }

    public final void setServicio_Pension(String Servicio_Pension) {
        this.Servicio_Pension = Servicio_Pension;
    }

    public double getPrecio_Consulta() {
        return Precio_Consulta;
    }

    public final void setPrecio_Consulta(double Precio_Consulta) {
        this.Precio_Consulta = Precio_Consulta;
    }

    public double getPrecio_Vacuna() {
        return Precio_Vacuna;
    }

    public final void setPrecio_Vacuna(double Precio_Vacuna) {
        this.Precio_Vacuna = Precio_Vacuna;
    }

    public double getPrecio_Cirugia() {
        return Precio_Cirugia;
    }

    public final void setPrecio_Cirugia(double Precio_Cirugia) {
        this.Precio_Cirugia = Precio_Cirugia;
    }

    public double getPrecio_Desparasitacion() {
        return Precio_Desparasitacion;
    }

    public final void setPrecio_Desparasitacion(double Precio_Desparasitacion) {
        this.Precio_Desparasitacion = Precio_Desparasitacion;
    }

    public double getPrecio_Estetica() {
        return Precio_Estetica;
    }

    public final void setPrecio_Estetica(double Precio_Estetica) {
        this.Precio_Estetica = Precio_Estetica;
    }

    public double getPrecio_Pension() {
        return Precio_Pension;
    }

    public final void setPrecio_Pension(double Precio_Pension) {
        this.Precio_Pension = Precio_Pension;
    }

    public double getPrecioTotal() {
        return PrecioTotal;
    }

    public final void setPrecioTotal(double PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public final void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getDescuento() {
        return Descuento;
    }

    public final void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }

    //relaciones
    // relacion Servicio  a cliente
    public void AsignaCliente(Cliente c) {
        this.Custumer = c;
    }

    public String getNombreServicioCliente() {
        return this.Custumer.getNombre();
        //Regresa el nombre del usuario
    }

    // relacion Servicio a Mascota
    public void AsignaMascota(Mascota m) {
        this.m = m;
    }

    public String getNombreServicioMascota() {
        return this.m.getNombre_Mascota();
        //Regresa el nombre del la mascota
    }

}
