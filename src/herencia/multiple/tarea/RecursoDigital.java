/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia.multiple.tarea;

public abstract class RecursoDigital {
    private String titulo;
    private String autor;

    public RecursoDigital(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}
