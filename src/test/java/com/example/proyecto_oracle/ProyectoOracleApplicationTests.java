package com.example.proyecto_oracle;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.proyecto_oracle.dao.SexoDao;
import com.example.proyecto_oracle.entity.Sexo;

@SpringBootTest
class ProyectoOracleApplicationTests {
	@Autowired
	private SexoDao sexoDao;
	@Test
	void contextLoads() {
		List<Sexo> lista = sexoDao.readAll();
		System.out.println(lista);
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i).getNombre());
		}
		
	}

}
