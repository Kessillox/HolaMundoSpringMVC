package cl.infoclub.fsj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.infoclub.fsj.model.Mensaje;
import cl.infoclub.fsj.service.IMensajeService;

@Controller
@RequestMapping(value="/saludos", method = RequestMethod.GET)
public class HelloController {
	
	@Autowired
	IMensajeService mensajeService;
	
	
	
	@RequestMapping(value = "/sayhello", method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.put("saludo", "Hola Mundo Spring desde mi controlador");
		return "hello";
	}

	@RequestMapping(value = "/saygoodbye", method = RequestMethod.GET)
	public String sayGoodbye(ModelMap model) {
		model.put("saludo", "Adios Mundo Spring desde mi controlador");
		return "hello";
	}
	
	@RequestMapping(value="/messageList", method=RequestMethod.GET)
	public String getDataMessageList(ModelMap model) {
		
		model.addAttribute("dataMensajeList", mensajeService.getDataMensajeList());
		return "mensajes";
	}
	
	@RequestMapping(value="/saveMessage",
	method=RequestMethod.POST)
	public String saveDataMessage(@ModelAttribute("mensaje") Mensaje mensaje) {

		System.out.println("saveData ejecutado");	

		return "mensajes";
	}
}