package com.wsdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wsdev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

	
}
