//this one doesnt have the correct foreign key

package com.Sakila.api.SakilaApp;

import javax.persistence.*;

@Entity
@Table(name = "film_category") //reference database table
public class FilmCategory {
    //Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    int filmID;

    @Column(name = "category_id")
    int categoryID;

    //Constructors
    public FilmCategory(int film_id, int category_id){
        this.filmID = film_id;
        this.categoryID = category_id;
    }
    public FilmCategory()
    {

    }

    //Methods

    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }
}