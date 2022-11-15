package cl.infoclub.fsj.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.infoclub.fsj.model.Mensaje;
import cl.infoclub.fsj.service.IMensajeService;

@Service("mensajeServiceImpl")
public class MensajeServiceImpl implements IMensajeService {

	
	
	public MensajeServiceImpl() {
		super();
		mensajeList = new ArrayList<Mensaje>();
	}

	@Autowired
	Mensaje mensaje;
	List<Mensaje> mensajeList;
	
	@Override
	public List<Mensaje> getDataMensajeList() {

		mensaje.setRemitente("Ducksito");
		mensaje.setMensaje("La vulca esta trb buena");
		mensajeList.add(mensaje);

		return mensajeList;
	}

	@Override
	public void saveDataMensaje(Mensaje mensaje) {
		System.out.println(mensaje.getRemitente() + "dice que " + mensaje.getMensaje());		
	}
	

}
