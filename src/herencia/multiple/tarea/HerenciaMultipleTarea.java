/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia.multiple.tarea;

public class HerenciaMultipleTarea {

    public static void main(String[] args) {
        LibroElectronico novela = new LibroElectronico("La Divina Comedia", "Dante Alighieri", 15.90, 18.0);

        novela.descargar(3);
        System.out.println("Titulo: " + novela.getTitulo());
        System.out.println("Autor: " + novela.getAutor());
        System.out.println("Precio de venta: " + novela.calcularPrecioVenta());
        novela.descargar(2);
        System.out.println("Descargas totales: " + novela.getDescargasTotales());
    }
    
}
