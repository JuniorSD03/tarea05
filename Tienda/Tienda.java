package Tienda;

public class Tienda {

    //DECLARAMOS VARIABLES
    private Cliente cliente[];
    private int contadorCliente;
    private String nombre;
    private String direccion;


    //GENERAMOS NUESTROS CONSTRUCTORES
    public Tienda() {
        this.cliente = new Cliente[9];
        this.contadorCliente = 0;
    }

    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }


    //METODOS PARA AGREGAR CLIENTE
    public void agregarCliente(Cliente cliente){
        this.cliente[contadorCliente++] = cliente;
    }


    //METODO PARA RETORNAR CLIENTE
    public Cliente[] getCliente(){
        return this.cliente;
    }


    //METODO PARA ORDENAR POR CÓDIGO
    public void ordenar(){

        /*Comenzamos a comparar los códigos de los clientes para ordenarlos de menor a mayor*/
        for (int i = 0; i < cliente.length; i++ ){
            for (int j = i + 1 ; j < cliente.length  ; j++ ){
                if (cliente[i].getCodigo() > cliente[j].getCodigo()){
                    Cliente temp=cliente[i]; /*Declaramos una varible auxiliar para aplicar el método de burbuja para ordenar*/
                    cliente[i]=cliente[j];
                    cliente[j]=temp;
                    //System.out.println(cliente[posicion[j]].getCodigo() + " cambió con " + cliente[posicion[i]].getCodigo()); /*Guía para ver como se va ordenando*/
                }
            }
        }

    }


    //GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
