package Tienda;


public class Cliente {

    //DECLARAMOS VARIABLES
    private String nombres;
    private String apellidos;
    private Integer codigo;


    //CREAMOS UN CONSTRUCTOR
    public Cliente(String nombres, String apellidos, Integer codigo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
    }


    //GETTER nota: SETTER no usado
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Integer getCodigo() {
        return codigo;
    }

}
