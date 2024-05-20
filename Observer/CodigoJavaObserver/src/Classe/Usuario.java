/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classe;

/**
 *
 * @author neyra
 */
public class Usuario implements IObserver{
    private String livro;
    private String genero;


    //Método get para Livro
    public String getLivro() {
        return livro;
    }
    //Método get para Genero
    public String getGenero() {
        return genero;
    }

   
    //Método set para Livro
    public void setLivro(String livro) {
        this.livro = livro;
    }
    //Método set para Genero
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void Update() {
        System.out.println("Está disponivel na biblioteca!");
        System.out.println("Livro: " + livro);
        System.out.println("Genero: " + genero);
    }
    
}
