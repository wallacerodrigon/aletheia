package br.jus.trf1.aletheia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LotesController {

	@RequestMapping("/lotes/novo")
	public String novo() {
		return "lote/CadastroLote";
	}
	
}