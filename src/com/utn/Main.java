package com.utn;

public class Main {

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        ejercicio3();
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

    public static void ejercicio2() {
        //b. Cree un objeto de tipo Cliente, imprima sus detalles por pantalla. Para esto
        //haga uso de un método que facilite la impresión del mismo.
        var cliente1 = new Cliente("Pepe", "pepe@grillo.com", (byte)15);
        System.out.println(cliente1.toString());

        //e. Analizar de agregar el tipo ItemVenta, que representa un producto que
        //forma parte de la venta. El mismo contiene un id, un nombre, descripción y
        //precio unitario.
        var batidora = new ItemVenta(1, "Batidora", 2, 450);
        var bowl = new ItemVenta(2, "Bowl", 1, 100);
        ItemVenta[] items = {batidora, bowl};

        //c. Cree un objeto de tipo Factura que posea al Cliente anteriormente creado.
        //Una vez hecho esto, imprima por pantalla el monto total de esta Factura y el
        //monto total luego de aplicarle el descuento.
        var factura1 = new Factura(cliente1, 1000, items);
        System.out.println("El monto total es: " + factura1.getMonto());

        //d. Cree un método que facilite la impresión del objeto de tipo Factura y que
        //siga el siguiente formato.
        System.out.println(factura1.toString());
    }

    public static void ejercicio3() {
        //a. Crear un Cliente e imprimirlo en pantalla.
        var carla = new Cliente("Carla", "carla@bustos.com", (byte)10);
        System.out.println(carla.toString());

        //b. Crear una Cuenta bancaria para el Cliente anterior con un saldo inicial de
        //10000.
        var cuentaCarla = new CuentaBancaria(carla, 10000);
        System.out.println(cuentaCarla.toString());
    }

}
