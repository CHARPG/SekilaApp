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
	private FilmRepository filmRepository;
	private LanguageRepository languageRepository;

	public SakilaAppApplication(ActorRepository actorRepository, CategoryRepository categoryRepository, FilmRepository filmRepository, LanguageRepository languageRepository){
		this.actorRepository = actorRepository;
		this.categoryRepository = categoryRepository;
		this.filmRepository = filmRepository;
		this.languageRepository = languageRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaAppApplication.class, args);
	}

	//------------------------------------Actors
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

	@GetMapping("/ActorName/{id}")
	@ResponseBody
	public String getActorVar(@PathVariable Integer id){
		int nameLength = actorRepository.findById(id).get().firstName.length() + actorRepository.findById(id).get().lastName.length();
		return actorRepository.findById(id).get().firstName + " " + actorRepository.findById(id).get().lastName + " " + nameLength;
	}

	//------------------------------------Categories
	@GetMapping("/allCategories")
	public @ResponseBody
	Iterable<Category> getAllCategories(){
		return categoryRepository.findAll();
	}

	@GetMapping("/Category/{id}")
	@ResponseBody
	public Optional<Category> getCategory(@PathVariable Integer id){
		return categoryRepository.findById(id);
	}



	@GetMapping("/filmCategory/{id}")
	@ResponseBody
	public Iterable<Object> getFilmCategory(@PathVariable Integer id){
		return filmRepository.getFilmCategory(id);
	}
	@GetMapping("/filmActor/{id}")
	@ResponseBody
	public Iterable<Object> getFilmActor(@PathVariable Integer id){
		return filmRepository.getFilmActor(id);
	}



	@GetMapping("/allFilms")
	public @ResponseBody
	Iterable<Film> getAllFilms(){
		return filmRepository.findAll();
	}

	@GetMapping("/Film/{id}")
	@ResponseBody
	public Optional<Film> getFilm(@PathVariable Integer id){
		return filmRepository.findById(id);
	}

	//add
	@PostMapping("/addActor")
	@ResponseBody
	public String addActor(@RequestBody Actor actor){
		actorRepository.save(actor);
		return ("Actor added");
	}

	//delete
	@DeleteMapping("/deleteActor/{id}")
	@ResponseBody
	public String deleteActor(@PathVariable Integer id){
		actorRepository.deleteById(id);
		return ("Actor " + id + " deleted");
	}

	//update
	@PutMapping("/editActor/{id}")
	@ResponseBody
	public String editActor(@PathVariable Integer id, @RequestBody Actor newActor){
		final Actor actor = actorRepository.findById(id).get();
		actor.setFirstName(newActor.firstName);
		actor.setLastName(newActor.lastName);
		actorRepository.save(actor);
		return ("Actor " + id + " updated");
	}
}
