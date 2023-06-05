package ug.practicas.dominio;

import java.sql.Date;

public abstract class Usuario {
    protected String cedula, nombres, telefono, correo, direccion;
    protected Date prestamoFecha;
    protected boolean socio;


    public Usuario(String cedula, String nombres, String telefono, String correo, String direccion,boolean socio) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.socio = socio;
    }



    public void datosUsuario()
    {
        System.out.println("------------------DATOS DEL USUARIO------------------");
        System.out.println("Nombre: "+nombres+"\t\t Cedula: "+cedula);
        System.out.println("Telefono: "+telefono+"\t Correo Electronico: "+correo);
        System.out.println("Direccion: "+direccion);
        verificarSocio(socio);
    }

    protected void verificarSocio(boolean socio)
    {
        if (socio)
        {
  
            System.out.println("Si es socio");
        }
        else
        {
            System.out.println("No es socio");
        }
    }

}
