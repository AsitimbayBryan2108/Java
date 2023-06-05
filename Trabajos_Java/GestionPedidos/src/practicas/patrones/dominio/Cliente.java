package practicas.patrones.dominio;

public class Cliente 
{
   private int codigo;
   private String cedula;
   private String nombres;
   private String direccion;
   
   //#region Constructores
   public Cliente() {
   }

   public Cliente(int codigo, String cedula, String nombres, String direccion) {
      this.codigo = codigo;
      this.cedula = cedula;
      this.nombres = nombres;
      this.direccion = direccion;
   }   
   //#endregion 

   //! Metodos de Acceso
   

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
      result = prime * result + codigo;
      result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
      result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
      return result;
   }
   

   public int getCodigo() {
      return codigo;
   }

   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }

   public String getCedula() {
      return cedula;
   }

   public void setCedula(String cedula) {
      this.cedula = cedula;
   }

   public String getNombres() {
      return nombres;
   }

   public void setNombres(String nombres) {
      this.nombres = nombres;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Cliente other = (Cliente) obj;
      if (cedula == null) {
         if (other.cedula != null)
            return false;
      } else if (!cedula.equals(other.cedula))
         return false;
      if (codigo != other.codigo)
         return false;
      if (direccion == null) {
         if (other.direccion != null)
            return false;
      } else if (!direccion.equals(other.direccion))
         return false;
      if (nombres == null) {
         if (other.nombres != null)
            return false;
      } else if (!nombres.equals(other.nombres))
         return false;
      return true;
   }
   

   @Override
   public String toString() 
   {
      return codigo + " " + cedula + " " + nombres + " "+direccion ;
   }

   public String getDireccion() {
      return direccion;
   }

   public void setDireccion(String direccion) {
      this.direccion = direccion;
   }
   
   //#endregion
   
}
