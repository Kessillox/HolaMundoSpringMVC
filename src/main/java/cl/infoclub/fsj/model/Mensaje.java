package cl.infoclub.fsj.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Component("mensaje")
public class Mensaje {

	public Mensaje() {
		super();
	}
	public Mensaje(String remitente, String mensaje) {
		super();
		this.remitente = remitente;
		this.mensaje = mensaje;
	}
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	String remitente;
	String mensaje;
}
