package com.tomazhca.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tomazhca.dsmovie.entities.Score;
import com.tomazhca.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
}
