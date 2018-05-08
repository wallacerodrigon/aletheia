package br.jus.trf1.aletheia.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.jus.trf1.aletheia.model.Contagem;

@Controller
public class ContagensController {
	
	@RequestMapping("/contagens/novo")
	public String novo(Contagem contagem) {
		return "contagem/CadastroContagem";
	}
	
	@RequestMapping(value = "/contagens/novo", method= RequestMethod.POST)
	public String cadastrar(@Valid Contagem contagem, BindingResult result, Model model, RedirectAttributes attributes){
		if (result.hasErrors()) {
			return novo(contagem);
		}
		
		//salvar no BD
		
		attributes.addFlashAttribute("mensagem", "Contagem salva com sucesso!");
		return "redirect:/contagens/novo";
	}
	
	@RequestMapping("/contagens/cadastro")
	public String cadastro() {
		return "contagem/cadastro-produto";
	}
}
