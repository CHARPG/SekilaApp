package com.Sakila.api.SakilaApp;


import io.cucumber.core.gherkin.Argument;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
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
        sakilaAppApplication = new SakilaAppApplication(actorRepository, categoryRepository, filmRepository, languageRepository);
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
}
