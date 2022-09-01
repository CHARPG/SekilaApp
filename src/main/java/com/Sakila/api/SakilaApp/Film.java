package com.Sakila.api.SakilaApp;

import javax.persistence.*;

@Entity
@Table(name = "film") //reference database table
public class Film {
    //Attributes
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int filmID;

    @Column(name = "title")
    String filmTitle;

    @Column(name = "description")
    String filmDescription;

    @Column(name = "release_year")
    int filmReleaseYear;

    @Column(name = "language_id")
    int filmLanguageId;

    @Column(name = "original_language_id")
    int filmOriginalLanguageId;

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

    //Constructors
    public Film(String title, String description, int release_year, int language_id, int original_language_id, int rental_duration, float rental_rate, int length, float replacement_cost, String rating, String special_features){
        this.filmTitle = title;
        this.filmDescription = description;
        this.filmReleaseYear = release_year;
        this.filmLanguageId = language_id;
        this.filmOriginalLanguageId = original_language_id;
        this.filmRentalDuration = rental_duration;
        this.filmRentalRate = rental_rate;
        this.filmLength = length;
        this.filmReplacementCost = replacement_cost;
        this.filmRating = rating;
        this.filmSpecialFeatures = special_features;
    }
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

    public int getFilmLanguageId() {
        return filmLanguageId;
    }

    public void setFilmLanguageId(int filmLanguageId) {
        this.filmLanguageId = filmLanguageId;
    }

    public int getFilmOriginalLanguageId() {
        return filmOriginalLanguageId;
    }

    public void setFilmOriginalLanguageId(int filmOriginalLanguageId) {
        this.filmOriginalLanguageId = filmOriginalLanguageId;
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
}
