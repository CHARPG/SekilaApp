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

	@Autowired
	private ActorRepository actorRepository;
	private CategoryRepository categoryRepository;
	private FilmActorRepository filmActorRepository;
	private FilmCategoryRepository filmCategoryRepository;
	private FilmRepository filmRepository;
	private FilmTextRepository filmTextRepository;
	private LanguageRepository languageRepository;

	public SakilaAppApplication(ActorRepository actorRepository, CategoryRepository categoryRepository, FilmActorRepository filmActorRepository, FilmCategoryRepository filmCategoryRepository, FilmRepository filmRepository, FilmTextRepository filmTextRepository, LanguageRepository languageRepository){
		this.actorRepository = actorRepository;
		this.categoryRepository = categoryRepository;
		this.filmActorRepository = filmActorRepository;
		this.filmCategoryRepository = filmCategoryRepository;
		this.filmRepository = filmRepository;
		this.filmTextRepository = filmTextRepository;
		this.languageRepository = languageRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaAppApplication.class, args);
	}

	@GetMapping("/allActors")
	public @ResponseBody
	Iterable<Actor> getAllActors(){
		return actorRepository.findAll();
	}

	@GetMapping("/Actor/{id}")
	@ResponseBody
	public Optional<Actor> getActor(@PathVariable Integer id){
		return actorRepository.findById(id);
	}
}
