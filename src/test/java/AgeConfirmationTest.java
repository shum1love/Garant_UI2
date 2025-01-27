import PageObject.HeaderPage;
import PageObject.HeaderPageSteps;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import java.util.List;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.support.PageFactory.initElements;

public class AgeConfirmationTest {
    private HeaderPage headerPage;
    private HeaderPageSteps headerPageSteps;
    @BeforeEach
    public void setUp() {
        Configuration.baseUrl = "https://shop.garant21.ru/";
        Configuration.browserSize = "1920x1080";// Запускает браузер в полноэкранном режиме
        open("/");

        // Инициализация объектов страниц
        headerPage = new HeaderPage();
        headerPageSteps = new HeaderPageSteps(headerPage);
    }
    @Test
    public void testClickButtonSeverodvinsk() {
        // Действие: клик по кнопке "Северодвинск"
        headerPageSteps.clickButtonSeverodvinsk();

        // Здесь можно добавить проверки, например, что город успешно выбран
        // assertTrue(someCondition);
    }
    @Test
    public void testClickButtonCitySelectClose() {
        // Действие:
        headerPageSteps.clickButtonSitySelectClose();

        // Здесь можно добавить проверки, например, что город успешно выбран
        // assertTrue(someCondition);
    }

}
