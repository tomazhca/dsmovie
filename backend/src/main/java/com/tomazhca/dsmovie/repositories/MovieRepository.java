package com.tomazhca.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tomazhca.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}
