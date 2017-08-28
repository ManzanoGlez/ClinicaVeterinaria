package Objetos;

/**
 *
 * @author Manzano
 */
public class Factura {
    
    private int Folio;
    private int NumRazonSocial;
    
 
    
    private String Dir_Establecimiento;
    private String Tel_Extablecimiento;
    private String Fecha_Facturacion;
    
    private Double Total;
    private Double Iva;
    private Double Subtotal;
    
    public Factura() {
        this.setFolio(12345);
        this.setNumRazonSocial(123456789);
        this.setDir_Establecimiento("Establecimiento  : Luis J. Jiménez 577, Colonia Primero de Mayo, C.P. 44979 Guadalajara, Jalisco, México");
        this.setTel_Extablecimiento("Teléfono: + 52 (33) 3030-0900, 01, 02, 03");
        this.setFecha_Facturacion("24/07/2017");
        this.setTotal(0.0);
        this.setIva(16.00);
        this.setSubtotal(0.0);
        
    }
    
    public Factura(int Folio, int NumRazonSocial, String Dir_Establecimiento, String Tel_Extablecimiento, String Fecha_Facturacion, Double Total, Double Iva, Double Subtotal) {
        this.Folio = Folio;
        this.NumRazonSocial = NumRazonSocial;
        this.Dir_Establecimiento = Dir_Establecimiento;
        this.Tel_Extablecimiento = Tel_Extablecimiento;
        this.Fecha_Facturacion = Fecha_Facturacion;
        this.Total = Total;
        this.Iva = Iva;
        this.Subtotal = Subtotal;
    }
    
    public int getFolio() {
        return Folio;
    }
    
    public final void setFolio(int Folio) {
        this.Folio = Folio;
    }
    
    public int getNumRazonSocial() {
        return NumRazonSocial;
    }
    
    public final void setNumRazonSocial(int NumRazonSocial) {
        this.NumRazonSocial = NumRazonSocial;
    }
    
    public String getDir_Establecimiento() {
        return Dir_Establecimiento;
    }
    
    public final void setDir_Establecimiento(String Dir_Establecimiento) {
        this.Dir_Establecimiento = Dir_Establecimiento;
    }
    
    public String getTel_Extablecimiento() {
        return Tel_Extablecimiento;
    }
    
    public final void setTel_Extablecimiento(String Tel_Extablecimiento) {
        this.Tel_Extablecimiento = Tel_Extablecimiento;
    }
    
    public String getFecha_Facturacion() {
        return Fecha_Facturacion;
    }
    
    public final void setFecha_Facturacion(String Fecha_Facturacion) {
        this.Fecha_Facturacion = Fecha_Facturacion;
    }
    
    public Double getTotal() {
        return Total;
    }
    
    public final void setTotal(Double Total) {
        this.Total = Total;
    }
    
    public Double getIva() {
        return Iva;
    }
    
    public final void setIva(Double Iva) {
        this.Iva = Iva;
    }
    
    public Double getSubtotal() {
        return Subtotal;
    }
    
    public final void setSubtotal(Double Subtotal) {
        this.Subtotal = Subtotal;
    }
    
}
