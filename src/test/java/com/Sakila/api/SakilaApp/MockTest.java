package com.Sakila.api.SakilaApp;


import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockTest {

    private SakilaAppApplication sakilaAppApplication;

    @Mock
    FilmRepository filmRepository;

/*    @BeforeEach
    void setup(){
        sakilaAppApplication = new SakilaAppApplication(filmRepository);
    }*/
/*
	@Test
	void contextLoads() {
	}*/

/*    @Test
    void testAllFilmData(){
        filmRepository.findById(1);

        Optional<Film> Expected = filmRepository.findById(1);
        Optional<Film> Actual = sakilaAppApplication.getFilm();

        Assertions.assertEquals(Expected, Actual, "nope");
    }*/
}
