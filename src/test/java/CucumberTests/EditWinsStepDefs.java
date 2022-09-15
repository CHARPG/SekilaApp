package CucumberTests;

import com.sakila.api.sakilaapp.Film;
import com.sakila.api.sakilaapp.FilmRepository;
import com.sakila.api.sakilaapp.SakilaAppApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;

public class EditWinsStepDefs {
    private SakilaAppApplication sakilaAppApplication;
    @Mock
    private FilmRepository filmRepository;

    public EditWinsStepDefs(){
        filmRepository = mock(FilmRepository.class);
        sakilaAppApplication = new SakilaAppApplication(filmRepository);
    }

    Film testFilm;
    Film expected;

    @Given("I have the film ID and want to edit the wins")
    public void i_have_the_film_id() {
        int id = 1;
        testFilm = new Film();
        testFilm.setFilmID(1);
        testFilm.setWin(0);
    }
    @When("A request is made to edit the wins")
    public void a_request_is_made_to_edit_the_data() {
        testFilm.setWin(testFilm.getWin() + 1);
    }
    @Then("Edit the films wins")
    public void edit_the_films_data() {
        Assertions.assertEquals(1, testFilm.getWin(), "Wins not updated");
    }
}
