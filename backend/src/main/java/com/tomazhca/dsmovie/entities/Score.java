package com.tomazhca.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {

	@EmbeddedId
	//Como você tem uma chave composta aqui, precisa criar uma classe auxiliar, neste caso, o ScorePK (primary key)
	private ScorePK id = new ScorePK();
	private Double value;
	
	public Score() {
	}
	
	//Esse argumento abaixo servirá para associar o score ao filme
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	//Mesma coisa para o usuário
	public void setUser(User user) {
		id.setUser(user);
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
}
