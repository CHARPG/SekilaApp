package com.Sakila.api.SakilaApp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MockTest {

    private SakilaAppApplication sakilaAppApplication;

    private ActorRepository actorRepository;
    private CategoryRepository categoryRepository;
    private FilmRepository filmRepository;
    private LanguageRepository languageRepository;
    public MockTest(){
        actorRepository = mock(ActorRepository.class);
        categoryRepository = mock(CategoryRepository.class);
        filmRepository = mock(FilmRepository.class);
        languageRepository = mock(LanguageRepository.class);
        sakilaAppApplication = new SakilaAppApplication(filmRepository);
    }

    @Test
    void GetFilm(){
        when(filmRepository.findById(1)).thenReturn(Optional.of(new Film()));
        Film output = filmRepository.findById(1).get();
        Film expected = new Film();
        Assertions.assertEquals(expected, output, "film bad");
    }

    @Test
    void EditWins(){
        Film entry = new Film();
        Assertions.assertEquals(0, entry.win);
        when(filmRepository.findById(1)).thenReturn(Optional.of(entry));
        Film item = new Film();
        item.setWin(1);
        ArgumentCaptor<Film> captor = ArgumentCaptor.forClass(Film.class);
        sakilaAppApplication.addWin(1);
        verify(filmRepository).save(item);
    }

    @Test
    void Editlosses(){
        Film entry = new Film();
        Assertions.assertEquals(0, entry.loss);
        when(filmRepository.findById(1)).thenReturn(Optional.of(entry));
        Film item = new Film();
        item.setLoss(1);
        ArgumentCaptor<Film> captor = ArgumentCaptor.forClass(Film.class);
        sakilaAppApplication.addLoss(1);
        verify(filmRepository).save(item);
    }

    @Test
    void test_Film_ID()
    {
        Film testFilm = new Film();
        testFilm.setFilmID(1);
        Assertions.assertEquals(1, testFilm.getFilmID(), "this is not it");
    }
    @Test
    void test_Film_Title()
    {
        Film testFilm = new Film();
        testFilm.setFilmTitle("TestTitle");
        Assertions.assertEquals("TestTitle", testFilm.getFilmTitle(), "this is not it");
    }
    @Test
    void test_Film_Description()
    {
        Film testFilm = new Film();
        testFilm.setFilmDescription("TestDescription");
        Assertions.assertEquals("TestDescription", testFilm.getFilmDescription(), "this is not it");
    }
    @Test
    void test_Film_ReleaseYear()
    {
        Film testFilm = new Film();
        testFilm.setFilmReleaseYear(2022);
        Assertions.assertEquals(2022, testFilm.getFilmReleaseYear(), "this is not it");
    }
    @Test
    void test_Film_RentalDuration()
    {
        Film testFilm = new Film();
        testFilm.setFilmRentalDuration(1);
        Assertions.assertEquals(1, testFilm.getFilmRentalDuration(), "this is not it");
    }
    @Test
    void test_Film_RentalRate()
    {
        Film testFilm = new Film();
        testFilm.setFilmRentalRate(1);
        Assertions.assertEquals(1, testFilm.getFilmRentalRate(), "this is not it");
    }
    @Test
    void test_Film_Length()
    {
        Film testFilm = new Film();
        testFilm.setFilmLength(1);
        Assertions.assertEquals(1, testFilm.getFilmLength(), "this is not it");
    }
    @Test
    void test_Film_ReplacementCost()
    {
        Film testFilm = new Film();
        testFilm.setFilmReplacementCost(1);
        Assertions.assertEquals(1, testFilm.getFilmReplacementCost(), "this is not it");
    }
    @Test
    void test_Film_Rating()
    {
        Film testFilm = new Film();
        testFilm.setFilmRating("e");
        Assertions.assertEquals("e", testFilm.getFilmRating(), "this is not it");
    }
    @Test
    void test_Film_SpecialFeatures()
    {
        Film testFilm = new Film();
        testFilm.setFilmSpecialFeatures("na");
        Assertions.assertEquals("na", testFilm.getFilmSpecialFeatures(), "this is not it");
    }
    @Test
    void test_Film_Win()
    {
        Film testFilm = new Film();
        testFilm.setWin(1);
        Assertions.assertEquals(1, testFilm.getWin(), "this is not it");
    }
    @Test
    void test_Film_Loss()
    {
        Film testFilm = new Film();
        testFilm.setLoss(1);
        Assertions.assertEquals(1, testFilm.getLoss(), "this is not it");
    }
    @Test
    void test_Film_LanguageID()
    {
        Film testFilm = new Film();
        testFilm.setLanguage_id(1);
        Assertions.assertEquals(1, testFilm.getLanguage_id(), "this is not it");
    }
}
