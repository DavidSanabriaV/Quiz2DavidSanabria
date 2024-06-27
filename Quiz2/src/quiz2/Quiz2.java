/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2;

/**
 *
 * @author Aulas Heredia
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Control control1 = new Control(1025, "Primer dia de clases", "Mora", 144, 2020);
        
        //Llamado
        System.out.println("Id: " + control1.id);
        System.out.println("Titulo: " + control1.titulo);
        System.out.println("Autor: " + control1.autor);
        System.out.println("Duracion: " + control1.duracion + " segundos");
        System.out.println("Year: " + control1.year);
    }

}
