package com.promotion.ws.vo;

public class PromocionVo {
	private String id_username;
	private String typeFormat;
	private String duration;
	private String email;
	private String date;
	
	public PromocionVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PromocionVo(String id_username, String typeFormat, String duration, String email, String date) {
		super();
		this.id_username = id_username;
		this.typeFormat = typeFormat;
		this.duration = duration;
		this.email = email;
		this.date = date;
	}

	public String getId_username() {
		return id_username;
	}

	public void setId_username(String id_username) {
		this.id_username = id_username;
	}

	public String getTypeFormat() {
		return typeFormat;
	}

	public void setTypeFormat(String typeFormat) {
		this.typeFormat = typeFormat;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "PersonaVo [id_username=" + id_username + ", typeFormat=" + typeFormat + ", duration=" + duration
				+ ", email=" + email + ", date=" + date + "]";
	}
	
}


