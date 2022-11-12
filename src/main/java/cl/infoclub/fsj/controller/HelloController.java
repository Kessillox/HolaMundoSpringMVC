package cl.infoclub.fsj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/saludos", method = RequestMethod.GET)
public class HelloController {
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
}