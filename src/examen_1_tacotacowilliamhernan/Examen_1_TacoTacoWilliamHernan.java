/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_1_tacotacowilliamhernan;

/**
 *
 * @author William
 */

class Libro_Fisica{
    //ATRIBUTOS
    private int codigo;
    private String titulo;
    private String autor;
    private int anio_edicion;
    
    //CONSTRUCTOR
    
    public Libro_Fisica(int pCodigo, String pTitulo, String pAutor, int pAnio_Edicion){
        
        codigo=pCodigo;
        titulo=pTitulo;
        autor=pAutor;
        anio_edicion=pAnio_Edicion;
        
    }
    //METODOS
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;// this puntero invoca al atributo privado codigo
    }
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public int getAnio_Edicion(){
        return anio_edicion;
    }
    public void setAnio_Edicion(int anio_edicion){
        this.anio_edicion = anio_edicion;
    }
    
     @Override
    public String toString(){
        return "El titulo del libro es: "+titulo+" con CODIGO: "+codigo+" __"
                + " Su autor es: "+autor
                + " y su año de edicion es : "+anio_edicion+"";
    }
    
    
}
public class Examen_1_TacoTacoWilliamHernan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro_Fisica atributo1=new Libro_Fisica(24245, "Fisica Vectorial", " Vallejo Zambrano ", 2014);
        Libro_Fisica atributo2=new Libro_Fisica(24246, "Fisica Clasica", " Walter Perez ", 2017);
        Libro_Fisica atributo3=new Libro_Fisica(24247, "Fisica Espacial", " M. Fernadez ", 2015);
        
        System.out.println(atributo1.toString());
        System.out.println(atributo2.toString());
        System.out.println(atributo3.toString());
    }
    
}
