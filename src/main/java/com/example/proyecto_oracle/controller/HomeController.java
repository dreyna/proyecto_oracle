package com.example.proyecto_oracle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyecto_oracle.entity.Sexo;
import com.example.proyecto_oracle.service.SexoService;

@RestController
@RequestMapping("/sexo")
public class HomeController {
	@Autowired
	private SexoService sexoService;
	@GetMapping("/listar")
	public List<Sexo> mensaje() {
		return sexoService.readAll();
	}
}
