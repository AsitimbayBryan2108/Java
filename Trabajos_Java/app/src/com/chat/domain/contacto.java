package com.chat.domain;

public class contacto {
	
	private int id_cont;
	private String nombre;
	private Boolean estado;
	private String image;
	private String password;
	private String userName;
	
	public contacto(int id_cont, String nombre, Boolean estado, String image, String userName, String password) {
		super();
		this.id_cont = id_cont;
		this.nombre = nombre;
		this.estado = estado;
		this.password = password;
		this.userName = userName;
			if (image==""){
					this.image = "https://cdn-icons-png.flaticon.com/512/16/16363.png";
			}else {
				this.image = image;
			}		
	
			}
	
	public contacto (int id_cont, String userName, String password) {
		super();
		this.id_cont = id_cont;
		this.password = password;
		this.userName = userName;
		this.image = "https://cdn-icons-png.flaticon.com/512/16/16363.png";
		
	}
	
	public int getId_cont() {
		return id_cont;
	}

	public void setId_cont(int id_cont) {
		this.id_cont = id_cont;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	
}
	


