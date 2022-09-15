package com.Sakila.api.sakilaapp;

import javax.persistence.*;

@Entity
@Table(name = "actor") //reference database table called actor
public class Actor {
    //Attributes

    @Id
    @Column(name = "actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int actorID;
    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")  //set next line = database column called last_name
    String lastName;

    //Constructors
    public Actor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Actor()
    {
        //empty constructor
    }

    //Methods
    public int getActorID() {
        return actorID;
    }

    public void setActorID(int actorID) {
        this.actorID = actorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
