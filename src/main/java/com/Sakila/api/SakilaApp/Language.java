package com.Sakila.api.SakilaApp;

import javax.persistence.*;

@Entity
@Table(name = "language") //reference database table
public class Language {

    //Attributes
    @Id
    @Column(name = "language_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int languageID;
    @Column(name = "name")
    String languageName;

    //Constructors
    public Language(String name){
        this.languageName = name;
    }
    public Language()
    {
        //empty constructor
    }

    //Methods

    public int getLanguageID() {
        return languageID;
    }

    public void setLanguageID(int languageID) {
        this.languageID = languageID;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
}
