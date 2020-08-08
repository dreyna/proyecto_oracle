package com.example.proyecto_oracle.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.proyecto_oracle.dao.SexoDao;
import com.example.proyecto_oracle.entity.Sexo;

@Repository
public class SexoDaoImp implements SexoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Sexo> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select *from sexo", BeanPropertyRowMapper.newInstance(Sexo.class));
	}

}
