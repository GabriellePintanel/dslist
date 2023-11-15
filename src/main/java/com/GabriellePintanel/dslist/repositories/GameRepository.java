package com.GabriellePintanel.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GabriellePintanel.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
