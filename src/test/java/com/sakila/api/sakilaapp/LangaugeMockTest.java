package com.sakila.api.sakilaapp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class LangaugeMockTest {

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
        Language testLanguage = new Language("testLanguageInitial");
        testLanguage.setLanguageName("testLanguage");
        Assertions.assertEquals("testLanguage", testLanguage.getLanguageName(), "this is not it");
    }
}
