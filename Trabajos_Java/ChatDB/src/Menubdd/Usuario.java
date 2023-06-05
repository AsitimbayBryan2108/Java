package Menubdd;
public class Usuario 
{
    private int id_users;
    private String nombre;
    private String apellido;
    private String username;
    private String password;
    
    public Usuario(int id_users, String nombre, String apellido, String username, String password) 
    {
        this.id_users = id_users;
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
    }  
    //#region SETTERS AND GETTERS
    public int getId_users() {
        return id_users;
    }
    
    public void setId_users(int id_users) {
        this.id_users = id_users;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    //#endregion
    
    @Override
    public String toString() 
    {
        return "Usuario [id_users=" + id_users + ", nombre=" + nombre + ", apellido=" + apellido + ", username="
                + username + ", password=" + password + "]";
    }
    
}
