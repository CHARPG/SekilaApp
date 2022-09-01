package com.Sakila.api.SakilaApp;

import org.springframework.data.repository.CrudRepository;

public interface FilmCategoryRepository extends CrudRepository<Actor, Integer> {
}
