package com.Sakila.api.SakilaApp;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "film") //reference database table

public class Film {

    //Attributes
    @Id
    @Column(name = "film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int filmID;

    @ManyToMany
    @JoinTable(
            name = "film_actor",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    private Set<Actor> actors;

    @ManyToMany
    @JoinTable(
            name = "film_category",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> category;

    @Column(name = "title")
    private String filmTitle;

    @Column(name = "description")
    private String filmDescription;

    @Column(name = "release_year")
    private int filmReleaseYear;

    @ManyToOne
    @JoinColumn(name="language_id", nullable=false, insertable = false, updatable = false)
    private Language language;

    @Column(name="language_id", nullable=false)
    private Integer language_id;
    @Column(name = "rental_duration")
    private int filmRentalDuration;

    @Column(name = "rental_rate")
    private float filmRentalRate;

    @Column(name = "length")
    private int filmLength;

    @Column(name = "replacement_cost")
    private float filmReplacementCost;

    @Column(name = "rating")
    private String filmRating;

    @Column(name = "special_features")
    private String filmSpecialFeatures;

    @Column(name = "win")
    int win;

    @Column(name = "loss")
    int loss;

    public Film()
    {
        //empty constructor
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return filmID == film.filmID && filmReleaseYear == film.filmReleaseYear && filmRentalDuration == film.filmRentalDuration && Float.compare(film.filmRentalRate, filmRentalRate) == 0 && filmLength == film.filmLength && Float.compare(film.filmReplacementCost, filmReplacementCost) == 0 && win == film.win && loss == film.loss && Objects.equals(actors, film.actors) && Objects.equals(category, film.category) && Objects.equals(filmTitle, film.filmTitle) && Objects.equals(filmDescription, film.filmDescription) && Objects.equals(language, film.language) && Objects.equals(language_id, film.language_id) && Objects.equals(filmRating, film.filmRating) && Objects.equals(filmSpecialFeatures, film.filmSpecialFeatures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmID, actors, category, filmTitle, filmDescription, filmReleaseYear, language, language_id, filmRentalDuration, filmRentalRate, filmLength, filmReplacementCost, filmRating, filmSpecialFeatures, win, loss);
    }
}
