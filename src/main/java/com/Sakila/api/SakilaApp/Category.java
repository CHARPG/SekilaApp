package com.Sakila.api.SakilaApp;

import javax.persistence.*;

@Entity
@Table(name = "category") //reference database table
public class Category {
    //Attributes
    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int categoryID;

    @Column(name = "name")
    String categoryName;

    //Constructors
    public Category(String name){
        this.categoryName = name;
    }
    public Category()
    {
        //empty constructor
    }

    //Methods

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
