package com.Sakila.api.SakilaApp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;
import java.util.Optional;

public interface FilmRepository extends CrudRepository<Film, Integer> {
    @Query(nativeQuery = true, value = "SELECT category.category_id, category.name FROM film INNER JOIN film_category ON film.film_id = film_category.film_id INNER JOIN category ON film_category.category_id = category.category_id WHERE film.film_id = :id limit 1")
    Optional<String> getFilmCategory(@PathVariable Integer id);

    @Query(nativeQuery = true, value = "SELECT actor.first_name, last_name from film inner join film_actor on film.film_id = film_actor.film_id inner join actor on film_actor.actor_id = actor.actor_id where film.film_id = :id limit 1")
    Optional<String> getFilmActor(@PathVariable Integer id);

    @Query(nativeQuery = true, value = "SELECT name FROM film INNER JOIN language ON film.language_id = language.language_id WHERE film_id = :id limit 1")
    Optional<String> getFilmLangauge(@PathVariable Integer id);

    @Query(nativeQuery = true, value = "SELECT film.length FROM film WHERE film_id = :id limit 1")
    Optional<Integer> getFilmLength(@PathVariable Integer id);

    @Query(nativeQuery = true, value = "SELECT film.release_year FROM film WHERE film_id = :id limit 1")
    Optional<Date> getFilmReleaseYear(@PathVariable Integer id);

    @Query(nativeQuery = true, value = "SELECT film.rating FROM film WHERE film_id = :id limit 1")
    Optional<String> getFilmRating(Integer id);

    @Query(nativeQuery = true, value = "SELECT film.title FROM film WHERE film_id = :id limit 1")
    Optional<String> getFilmTitle(Integer id);

    @Query(nativeQuery = true, value = "SELECT film.description FROM film WHERE film_id = :id limit 1")
    Optional<String> getFilmDescription(Integer id);
}