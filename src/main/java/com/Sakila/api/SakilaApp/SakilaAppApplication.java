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
	private FilmTextRepository filmTextRepository;
	private LanguageRepository languageRepository;

	public SakilaAppApplication(ActorRepository actorRepository, CategoryRepository categoryRepository, FilmRepository filmRepository, FilmTextRepository filmTextRepository, LanguageRepository languageRepository){
		this.actorRepository = actorRepository;
		this.categoryRepository = categoryRepository;
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

	@GetMapping("/allCategories")
	public @ResponseBody
	Iterable<Category> getAllCategories(){
		return categoryRepository.findAll();
	}

	//add
	@PostMapping("/addActor")
	@ResponseBody
	public String addActor(@RequestBody Actor actor){
//		actor.setFirstName(actor.firstName);
//		actor.setLastName(actor.lastName);
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

	@GetMapping("/Actor/{id}")
	@ResponseBody
	public Optional<Actor> getActor(@PathVariable Integer id){
		return actorRepository.findById(id);
	}
}
