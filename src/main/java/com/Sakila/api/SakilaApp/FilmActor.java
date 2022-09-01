package com.Sakila.api.SakilaApp;

import javax.persistence.*;

@Entity
@Table(name = "film_actor") //reference database table
public class FilmActor {
    //Attributes
    @Column(name = "actor_id")
    int actorID;

    @Column(name = "film_id")
    int filmID;

    //Constructors
    public FilmActor(int actor_id, int film_id){
        this.actorID = actor_id;
        this.filmID = film_id;
    }
    public FilmActor()
    {

    }

    //Methods
    public int getActorID() {
        return actorID;
    }

    public void setActorID(int actorID) {
        this.actorID = actorID;
    }

    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }
}
