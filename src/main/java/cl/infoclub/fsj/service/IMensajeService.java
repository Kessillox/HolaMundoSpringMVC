package cl.infoclub.fsj.service;

import java.util.List;

import cl.infoclub.fsj.model.Mensaje;

public interface IMensajeService {
	
	List<Mensaje> getDataMensajeList();
	
	void saveDataMensaje(Mensaje mensaje);

}
