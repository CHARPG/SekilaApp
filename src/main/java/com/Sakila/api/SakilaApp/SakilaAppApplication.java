package com.Sakila.api.SakilaApp;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping("/Home")
@CrossOrigin
public class SakilaAppApplication {

	private FilmStats filmStats = new FilmStats();
	private static SakilaAppApplication instance;
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
//	@GetMapping("/generateFilm")
//	@ResponseBody
//	public String generateFilmStats(){
//		FilmStats firstFilm = new FilmStats();
//		//FilmStats secondFilm = new FilmStats();
//		firstFilm.generateStats();
//		//secondFilm.generateStats();
//		return (firstFilm.toString());
//	}
//
//	@GetMapping("/filmCategory/{id}")
//	@ResponseBody
//	public Optional<String> getFilmCategory(@PathVariable Integer id){
//		return filmRepository.getFilmCategory(id);
//	}
//	@GetMapping("/filmActor/{id}")
//	@ResponseBody
//	public Optional<String> getFilmActor(@PathVariable Integer id){
//		return filmRepository.getFilmActor(id);
//	}
//	@GetMapping("/filmLangauge/{id}")
//	@ResponseBody
//	public Optional<String> getFilmLanguage(@PathVariable Integer id){
//		return filmRepository.getFilmLangauge(id);
//	}
//
//	@GetMapping("/filmLength/{id}")
//	@ResponseBody
//	public Optional<Integer> getFilmLength(@PathVariable Integer id){
//		return filmRepository.getFilmLength(id);
//	}
//
//	@GetMapping("/filmReleaseYear/{id}")
//	@ResponseBody
//	public Optional<Date> getFilmReleaseYear(@PathVariable Integer id){
//		return filmRepository.getFilmReleaseYear(id);
//	}
//
//	@GetMapping("/filmRating/{id}")
//	@ResponseBody
//	public Optional<String> getFilmRating(@PathVariable Integer id){
//		return filmRepository.getFilmRating(id);
//	}
//
//	@GetMapping("/filmTitle/{id}")
//	@ResponseBody
//	public Optional<String> getFilmTitle(@PathVariable Integer id){
//		return filmRepository.getFilmTitle(id);
//	}
//
//	@GetMapping("/filmDescription/{id}")
//	@ResponseBody
//	public Optional<String> getFilmDescription(@PathVariable Integer id){
//		return filmRepository.getFilmDescription(id);
//	}
//
//	@GetMapping("/filmA/{id}")
//	@ResponseBody
//	public Iterable<Film> getFilmA(@PathVariable String id){
//		return filmRepository.getFilmByTitle(id);
//	}
//
//
//
//
//
//	@GetMapping("/getFilmData/{id}")
//	@ResponseBody
//	public Optional<String> getFilmData(@PathVariable Integer id){
//		return filmRepository.getFilmData(id);
//	}
//
//
//
//
//

	@GetMapping("/getFilm/{id}")
	@ResponseBody
	public Optional<Film> getFilm(@PathVariable Integer id){
		return filmRepository.findById(id);
	}
//
//
//
//
//
//
//	@GetMapping("/getAllFilms")
//	@ResponseBody
//	public Iterable<Film> getAllFilms(){
//		return filmRepository.findAll();
//	}
//
//	//add
//	@PostMapping("/addActor")
//	@ResponseBody
//	public String addActor(@RequestBody Actor actor){
//		actorRepository.save(actor);
//		return ("Actor added");
//	}
//
//	//delete
//	@DeleteMapping("/deleteActor/{id}")
//	@ResponseBody
//	public String deleteActor(@PathVariable Integer id){
//		actorRepository.deleteById(id);
//		return ("Actor " + id + " deleted");
//	}
//
//	//update
//	@PutMapping("/editActor/{id}")
//	@ResponseBody
//	public String editActor(@PathVariable Integer id, @RequestBody Actor newActor){
//		final Actor actor = actorRepository.findById(id).get();
//		actor.setFirstName(newActor.firstName);
//		actor.setLastName(newActor.lastName);
//		actorRepository.save(actor);
//		return ("Actor " + id + " updated");
//	}
}
