package com.wsdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wsdev.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

	
}
