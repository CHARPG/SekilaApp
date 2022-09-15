package com.Sakila.api.SakilaApp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ActorMockTest {

    private ActorRepository actorRepository;

    public ActorMockTest(){
        actorRepository = mock(ActorRepository.class);
    }

    @Test
    void test_Actor_ID()
    {
        Actor testActor = new Actor();
        testActor.setActorID(1);
        Assertions.assertEquals(1, testActor.getActorID(), "this is not it");
    }
    @Test
    void test_Actor_First_Name()
    {
        Actor testActor = new Actor();
        testActor.setFirstName("TestFirstName");
        Assertions.assertEquals("TestFirstName", testActor.getFirstName(), "this is not it");
    }
    @Test
    void test_Actor_Last_Name()
    {
        Actor testActor = new Actor();
        testActor.setLastName("TestLastName");
        Assertions.assertEquals("TestLastName", testActor.getLastName(), "this is not it");
    }
}
