package com.Sakila.api.SakilaApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping("/Home")
@CrossOrigin
public class SakilaAppApplication {
	private static SakilaAppApplication instance;
	@Autowired
	private FilmRepository filmRepository;

	public SakilaAppApplication(FilmRepository filmRepository){
		this.filmRepository = filmRepository;

		if(instance == null){
			instance = this;
		}
	}

	public static SakilaAppApplication getInstance(){
		return instance;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaAppApplication.class, args);
			}

	@GetMapping("/getFilm/{id}")
	@ResponseBody
	public Optional<Film> getFilm(@PathVariable Integer id){
		return filmRepository.findById(id);
	}

	@PutMapping("/editWins/{id}")
	@ResponseBody
	public String addWin(@PathVariable Integer id){
		final Film film = filmRepository.findById(id).get();
		film.setWin(film.getWin() + 1);
		filmRepository.save(film);
		return ("Film " + id + " updated");
	}

	@PutMapping("/editLosses/{id}")
	@ResponseBody
	public String addLoss(@PathVariable Integer id){
		final Film film = filmRepository.findById(id).get();
		film.setLoss(film.getLoss() + 1);
		filmRepository.save(film);
		return ("Film " + id + " updated");
	}

}
