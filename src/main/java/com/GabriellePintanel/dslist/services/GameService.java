package com.GabriellePintanel.dslist.services;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.GabriellePintanel.dslist.dto.GameMinDTO;
	import com.GabriellePintanel.dslist.entities.Game;
	import com.GabriellePintanel.dslist.repositories.GameRepository;

	@Service
	public class GameService {

		@Autowired
		private GameRepository gameRepository;
		
		public List<GameMinDTO> findAll() {
			List<Game> result = gameRepository.findAll();
			return result.stream().map(GameMinDTO::new).toList();
		}
	}
