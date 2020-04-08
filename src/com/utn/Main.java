package com.utn;

public class Main {

    public static void main(String[] args) {
        ejercicio1();
    }

    public static void ejercicio1() {
        //a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’.
        var jBloch = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        var aFrank = new Autor("Ana", "Frank", "anafrank@email.com", 'F');
        Autor[] autores = {jBloch, aFrank};
        //b. Imprima por pantalla al autor previamente instanciado.
        jBloch.mostrarAutor();
        aFrank.mostrarAutor();
        //c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450
        //pesos con una cantidad de 150 copias.
        var libro1 = new Libro("Effective Java", autores, (short)150, 450F);
        //d. Imprima por pantalla el libro instanciado.
        libro1.mostrarLibro();
        //e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la
        //cantidad en 50 copias.
        libro1.setPrecio(500F);
        libro1.aumentarStock((short)50);
        //f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el
        //Libro “Effective Java”.
        libro1.getAutores()[0].mostrarAutor();
        //g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el
        //siguiente mensaje: “El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”
        libro1.mensajeComercial();
    }

}
