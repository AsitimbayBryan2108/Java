package ug.practicas.dominio;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private int codigo;
    private String nombre;

    private List<Socio> listaSocios;
    private List<ClienteOcasional> listaClientes;

    public Biblioteca(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        listaSocios = new ArrayList<Socio>();
        listaClientes=new ArrayList<ClienteOcasional>();
    }

    public void agregarUsuario(Socio socio){
        listaSocios.add(socio);
    }
    public void agregarUsuario(ClienteOcasional cliente){
        listaClientes.add(cliente);
    }
}
