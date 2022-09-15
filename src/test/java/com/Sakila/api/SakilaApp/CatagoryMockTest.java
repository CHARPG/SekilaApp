package com.Sakila.api.SakilaApp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CatagoryMockTest {

    private CategoryRepository categoryRepository;

    public CatagoryMockTest(){
        categoryRepository = mock(CategoryRepository.class);
    }

    @Test
    void test_Category_ID()
    {
        Category testCategory = new Category();
        testCategory.setCategoryID(1);
        Assertions.assertEquals(1, testCategory.getCategoryID(), "this is not it");
    }

    @Test
    void test_Category_Name()
    {
        Category testCategory = new Category("testCategory");
        Assertions.assertEquals("testCategory", testCategory.getCategoryName(), "this is not it");
    }
}
