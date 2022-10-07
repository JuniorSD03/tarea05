package Tienda;

public class Main {
    public static void main(String[] args) {
        //INSTANCIAMOS
        Tienda tienda = new Tienda();


        //ARGUMENTOS DE LA TIENDA
        tienda.setNombre("Abarrotes Arturo");
        tienda.setDireccion("Avenida Olivos");


        //DATOS DEL ARREGLO CLIENTE
        tienda.agregarCliente(new Cliente("David", "Rocano Sandoval", 10101010));                 /*Cliente 01*/
        tienda.agregarCliente(new Cliente("Angelica Xiomara", "Torres Santiago", 50505050));      /*Cliente 02*/
        tienda.agregarCliente(new Cliente("Melissa", "Dominguez Tuanama", 70707070));             /*Cliente 03*/
        tienda.agregarCliente(new Cliente("Angel", "Baldeon Pilco", 40404040));                   /*Cliente 04*/
        tienda.agregarCliente(new Cliente("Michel Luisa", "Silice Sagitario", 60606060));         /*Cliente 05*/
        tienda.agregarCliente(new Cliente("Carla ", "Melendes Rodriguez", 80808080));             /*Cliente 06*/
        tienda.agregarCliente(new Cliente("Marisol Nayeli", "Hauxwell Neruda", 30303030));        /*Cliente 07*/
        tienda.agregarCliente(new Cliente("Franco", "Morales Noria", 90909090));                  /*Cliente 08*/
        tienda.agregarCliente(new Cliente("Jose Maria", "Aguirre Acosta", 20202020));             /*Cliente 09*/

        System.out.println("Nombre de la tienda: " + tienda.getNombre() + ", Direccion: " + tienda.getDireccion());

        //USAMOS EL FOREACH DE JAVA PARA IMPRIMIR EL ARREGLO
        for (Cliente cli: tienda.getCliente()){
            System.out.println("  _" + cli.getNombres() + " " + cli.getApellidos() + ", Codigo: " + cli.getCodigo());
        }

        /*Llamamos a nuestro método de ordenamiento*/
        tienda.ordenar();

        //Imprimimos el nuevo orden
        System.out.println("\nClientes ordenados de menor a mayor");
        for (Cliente cli: tienda.getCliente()){
            System.out.println("  _" + cli.getNombres() + " " + cli.getApellidos() + ", Codigo: " + cli.getCodigo());
        }

    }
}
