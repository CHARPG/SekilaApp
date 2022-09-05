package com.Sakila.api.SakilaApp;
import org.json.*;

import java.util.Random;

public class FilmStats{

    private SakilaAppApplication sakilaAppApplication = SakilaAppApplication.getInstance();

    private String name, language, description;
    private int id, health, attack, defense, agility, vitality;

    private Film film;
    public FilmStats(){
        sakilaAppApplication = SakilaAppApplication.getInstance();
    }
    public void generateStats(Long seed)
    {
        Random rand = (seed == null ? new Random(): new Random(seed));
        id = (Integer)rand.nextInt(1, 1000);
        film = sakilaAppApplication.getFilm(id).get();
        setVitality();
        setAgility();
        setDefense();
        setAttack();
        setHealth();
        setName();
        setLanguage();
        setDescription();
    }

    //random stats
    public void generateStats(){
        generateStats(null);
    }

    private void setHealth()
    {
        String category;
        category = sakilaAppApplication.getFilmCategory(id).get();
        health = category.length() + vitality;
    }

    private void setAttack()
    {
        String actorName;
        actorName = sakilaAppApplication.getFilmActor(id).get();
        attack = actorName.length();
    }

    private void setDefense()
    {
        int length;
        length = film.getFilmLength();
        defense = length;
    }

    private void setAgility()
    {
        int yearOfRelease;
        yearOfRelease = film.getFilmReleaseYear();
        agility = yearOfRelease; //get year returns the year -1900 so I add 1900 to get the value
    }

    private void setVitality()
    {
        String rating;
        rating = film.getFilmRating();
        vitality = rating.length();
    }

    private void setName()
    {
        name = film.getFilmTitle();
    }

    private void setLanguage()
    {
        language = sakilaAppApplication.getFilmLanguage(id).get();
    }

    private void setDescription()
    {
        description = film.getFilmDescription();
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getAgility() {
        return agility;
    }

    public int getVitality() {
        return vitality;
    }

    @Override
    public String toString(){
        return ("name: " + name + " language: " + language + " description: " + description + "\nhealth: " + health + " attack: " + attack + " defense: " + defense + " agility: " + agility + " vitality: " + vitality);
    }
}
