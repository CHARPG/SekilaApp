//this one doesnt have the correct foreign key

package com.Sakila.api.SakilaApp;

import javax.persistence.*;

@Entity
@Table(name = "film_text") //reference database table
public class FilmText {
    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    int filmID;

    @Column(name = "title")
    String filmTitle;

    @Column(name = "description")
    String filmDescription;

    //Constructors
    public FilmText(int film_id, String title, String description){
        this.filmID = film_id;
        this.filmTitle = title;
        this.filmDescription = description;
    }
    public FilmText()
    {

    }

    //Methods

    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public String getFilmDescription() {
        return filmDescription;
    }

    public void setFilmDescription(String filmDescription) {
        this.filmDescription = filmDescription;
    }
}
