package com.Sakila.api.SakilaApp;

import org.springframework.data.repository.CrudRepository;

public interface FilmActorRepository extends CrudRepository<Actor, Integer> {
}
