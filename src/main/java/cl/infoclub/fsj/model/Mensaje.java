package cl.infoclub.fsj.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Component("mensaje")
public class Mensaje {

	String remitente;
	String mensaje;
}
