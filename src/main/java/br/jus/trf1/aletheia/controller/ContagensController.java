package br.jus.trf1.aletheia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContagensController {
	
	@RequestMapping("/contagens/novo")
	public String novo() {
		return "contagem/CadastroContagem";
	}
}
