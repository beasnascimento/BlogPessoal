package com.blogpessoal.blogpessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb temas")
public class Tema {


@Id	
@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;


@NotNull
private String descricao;


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public String getDescricao() {
	return descricao;
}


public void setDescricao(String descricao) {
	this.descricao = descricao;
}
	
	
}
