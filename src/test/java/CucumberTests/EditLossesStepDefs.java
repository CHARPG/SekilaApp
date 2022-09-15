package CucumberTests;

import com.Sakila.api.sakilaapp.Film;
import com.Sakila.api.sakilaapp.FilmRepository;
import com.Sakila.api.sakilaapp.SakilaAppApplication;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;

public class EditLossesStepDefs {

    private SakilaAppApplication sakilaAppApplication;
    @Mock
    private FilmRepository filmRepository;

    public EditLossesStepDefs(){
        filmRepository = mock(FilmRepository.class);
        sakilaAppApplication = new SakilaAppApplication(filmRepository);
    }

    Film testFilm;
    Film expected;

    @Given("I have the film ID and want to edit the losses")
    public void i_have_the_film_id() {
        int id = 1;
        testFilm = new Film();
        testFilm.setFilmID(1);
        testFilm.setLoss(0);
    }
    @When("A request is made to edit the losses")
    public void a_request_is_made_to_edit_the_losses() {
        testFilm.setLoss(testFilm.getLoss() + 1);
    }
    @Then("Edit the films losses")
    public void edit_the_films_losses() {
        Assertions.assertEquals(1, testFilm.getLoss(), "Wins not updated");
    }
}
