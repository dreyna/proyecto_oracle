package com.example.proyecto_oracle.entity;

public class Sexo {
private int id_sexo;
private String nombre;
public Sexo(int id_sexo, String nombre) {
	this.id_sexo = id_sexo;
	this.nombre = nombre;
}
public Sexo() {
}
public int getId_sexo() {
	return id_sexo;
}
public void setId_sexo(int id_sexo) {
	this.id_sexo = id_sexo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

}
