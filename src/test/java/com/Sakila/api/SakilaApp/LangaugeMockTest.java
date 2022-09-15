package com.Sakila.api.SakilaApp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LangaugeMockTest {

    private LanguageRepository languageRepository;

    public LangaugeMockTest(){
        languageRepository = mock(LanguageRepository.class);
    }

    @Test
    void test_Language_ID()
    {
        Language testLanguage = new Language();
        testLanguage.setLanguageID(1);
        Assertions.assertEquals(1, testLanguage.getLanguageID(), "this is not it");
    }

    @Test
    void test_Language_Name()
    {
        Language testLanguage = new Language("testLanguage");
        Assertions.assertEquals("testLanguage", testLanguage.getLanguageName(), "this is not it");
    }
}
