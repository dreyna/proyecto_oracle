package com.example.proyecto_oracle.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyecto_oracle.dao.SexoDao;
import com.example.proyecto_oracle.entity.Sexo;
import com.example.proyecto_oracle.service.SexoService;
@Service
public class SexoServiceImpl implements SexoService {
	@Autowired
	private SexoDao sexoDao;
	@Override
	public List<Sexo> readAll() {
		// TODO Auto-generated method stub
		return sexoDao.readAll();
	}

}
