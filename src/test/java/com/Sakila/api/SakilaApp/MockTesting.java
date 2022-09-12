package com.Sakila.api.SakilaApp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.autoconfigure.web.servlet.ConditionalOnMissingFilterBean;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockTesting {

    private SakilaAppApplication sakilaAppApplication;

    @Mock
    FilmRepository filmRepository;

//    @BeforeEach
//    void setup(){
//        sakilaAppApplication = new SakilaAppApplication(filmRepository);
//    }
/*
	@Test
	void contextLoads() {
	}*/

/*    @Test
    void testAllFilmData(){
        filmRepository.findById(1);

        Optional<Film> Expected = filmRepository.findById(1);
        Optional<Film> Actual = sakilaAppApplication.getFilm();

        Assertions.assertEquals(Expected, Actual, "get all data for a film");
    }*/
}
