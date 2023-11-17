package com.GabriellePintanel.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GabriellePintanel.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
