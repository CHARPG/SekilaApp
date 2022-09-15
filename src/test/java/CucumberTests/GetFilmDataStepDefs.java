package CucumberTests;

import com.Sakila.api.sakilaapp.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;

import java.util.Optional;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GetFilmDataStepDefs {

    private SakilaAppApplication sakilaAppApplication;
    @Mock
    private FilmRepository filmRepository;

    public GetFilmDataStepDefs(){
        filmRepository = mock(FilmRepository.class);
        sakilaAppApplication = new SakilaAppApplication(filmRepository);
    }

    Film testFilm;
    Film expected;

    @Given("I have an ID")
    public void i_have_an_id() {
        int id = 1;
        expected = new Film();
        expected.setFilmID(1);
        expected.setFilmTitle("test title");
    }
    @When("A request is made for the data")
    public void a_request_is_made_for_the_data() {
        when(filmRepository.findById(1)).thenReturn(Optional.of(expected));
        testFilm = filmRepository.findById(1).get();
    }

    @Then("Return the correct data")
    public void return_the_correct_data() {
        Assertions.assertEquals(expected, testFilm, "Incorrect film");
    }
}