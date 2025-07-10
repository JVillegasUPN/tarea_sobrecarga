/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia.multiple.tarea;

public class LibroElectronico extends RecursoDigital implements Descargable, Vendible {
    private double precioBase;
    private double iva;
    private int descargasTotales;
    
    public LibroElectronico(String titulo, String autor, double precioBase, double iva){
        super(titulo, autor);
        this.precioBase = precioBase;
        this.iva = iva;
        this.descargasTotales = 0;
    }
    
    @Override
    public void descargar(int i){
        descargasTotales += i;
        System.out.println("Se han realizado "+i+" descargas de "+getTitulo());
    }
    
    @Override
    public double calcularPrecioVenta(){
        return precioBase + (precioBase * iva / 100);
    }
    
    public int getDescargasTotales(){
        return descargasTotales;
    }
    
}
