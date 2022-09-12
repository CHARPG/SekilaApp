package com.Sakila.api.SakilaApp;

import org.hibernate.mapping.Join;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "film") //reference database table

public class Film {



    //Attributes
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int filmID;

    @ManyToMany
    @JoinTable(
            name = "film_actor",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    Set<Actor> actors;

    @ManyToMany
    @JoinTable(
            name = "film_category",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    Set<Category> category;

    @Column(name = "title")
    String filmTitle;

    @Column(name = "description")
    String filmDescription;

    @Column(name = "release_year")
    int filmReleaseYear;

    @ManyToOne
    @JoinColumn(name="language_id", nullable=false, insertable = false, updatable = false)
    private Language language;

    @Column(name="language_id", nullable=false)
    private Integer language_id;
    @Column(name = "rental_duration")
    int filmRentalDuration;

    @Column(name = "rental_rate")
    float filmRentalRate;

    @Column(name = "length")
    int filmLength;

    @Column(name = "replacement_cost")
    float filmReplacementCost;

    @Column(name = "rating")
    String filmRating;

    @Column(name = "special_features")
    String filmSpecialFeatures;

    @Column(name = "win")
    int win;

    @Column(name = "loss")
    int loss;

    //Constructors
//    public Film(String title, String description, int release_year, int rental_duration, float rental_rate, int length, float replacement_cost, String rating, String special_features){
//        this.filmTitle = title;
//        this.filmDescription = description;
//        this.filmReleaseYear = release_year;
//        this.filmRentalDuration = rental_duration;
//        this.filmRentalRate = rental_rate;
//        this.filmLength = length;
//        this.filmReplacementCost = replacement_cost;
//        this.filmRating = rating;
//        this.filmSpecialFeatures = special_features;
//    }

    public Film()
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

    public int getFilmReleaseYear() {
        return filmReleaseYear;
    }

    public void setFilmReleaseYear(int filmReleaseYear) {
        this.filmReleaseYear = filmReleaseYear;
    }

    public int getFilmRentalDuration() {
        return filmRentalDuration;
    }

    public void setFilmRentalDuration(int filmRentalDuration) {
        this.filmRentalDuration = filmRentalDuration;
    }

    public float getFilmRentalRate() {
        return filmRentalRate;
    }

    public void setFilmRentalRate(float filmRentalRate) {
        this.filmRentalRate = filmRentalRate;
    }

    public int getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(int filmLength) {
        this.filmLength = filmLength;
    }

    public float getFilmReplacementCost() {
        return filmReplacementCost;
    }

    public void setFilmReplacementCost(float filmReplacementCost) {
        this.filmReplacementCost = filmReplacementCost;
    }

    public String getFilmRating() {
        return filmRating;
    }

    public void setFilmRating(String filmRating) {
        this.filmRating = filmRating;
    }

    public String getFilmSpecialFeatures() {
        return filmSpecialFeatures;
    }

    public void setFilmSpecialFeatures(String filmSpecialFeatures) {
        this.filmSpecialFeatures = filmSpecialFeatures;
    }

    public Set<Category> getCategory() {
        return category;
    }
    public Set<Actor> getActors() {
        return actors;
    }

    public Language getLanguage() {
        return language;
    }
    public void setLanguage_id(Integer languageId) {
        this.language_id = languageId;
    }
    public Integer getLanguage_id() {
        return language_id;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }
}
