package com.sakila.api.sakilaapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;
import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping("/Home")
@CrossOrigin
public class SakilaAppApplication {
	@Autowired
	private FilmRepository filmRepository;

	public SakilaAppApplication(FilmRepository filmRepository){
		this.filmRepository = filmRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaAppApplication.class, args);
			}

	//get all info for a specific film by id
	@GetMapping("/getFilm/{id}")
	@ResponseBody
	public Optional<Film> getFilm(@PathVariable Integer id){
		return filmRepository.findById(id);
	}

	//add 1 to a specific films win variable by 1
	@PutMapping("/editWins/{id}")
	@ResponseBody
	public String addWin(@PathVariable Integer id){
		Optional<Film> optional = filmRepository.findById(id);
		if(optional.isEmpty()){
			throw new NoSuchElementException();
		}
		Film film = optional.get();
		film.setWin(film.getWin() + 1);
		filmRepository.save(film);
		return ("Film " + id + " updated");
	}

	//add 1 to a specific films loss variable by 1
	@PutMapping("/editLosses/{id}")
	@ResponseBody
	public String addLoss(@PathVariable Integer id){
		Optional<Film> optional = filmRepository.findById(id);
		if(optional.isEmpty()){
			throw new NoSuchElementException();
		}
		Film film = optional.get();
		film.setLoss(film.getLoss() + 1);
		filmRepository.save(film);
		return ("Film " + id + " updated");
	}
}
