package br.jus.trf1.aletheia.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.jus.trf1.aletheia.model.Demanda;

@Controller
public class DemandasController {
	
	@RequestMapping("/demandas/novo")
	public String novo(Demanda contagem) {
		return "demanda/CadastroDemanda";
	}
	
	@RequestMapping(value = "/demandas/novo", method= RequestMethod.POST)
	public String cadastrar(@Valid Demanda contagem, BindingResult result, Model model, RedirectAttributes attributes){
		if (result.hasErrors()) {
			return novo(contagem);
		}
		
		//salvar no BD
		
		attributes.addFlashAttribute("mensagem", "Demanda salva com sucesso!");
		return "redirect:/demandas/novo";
	}

}
