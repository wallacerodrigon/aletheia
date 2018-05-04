package br.jus.trf1.aletheia.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import br.jus.trf1.aletheia.controller.ContagensController;

@Configuration
@ComponentScan(basePackageClasses = { ContagensController.class })
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

}
