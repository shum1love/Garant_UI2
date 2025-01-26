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
public class AgeConfirmationTest {
    private HeaderPage headerPage;
    private HeaderPageSteps headerPageSteps;
    @BeforeEach
    public void setUp() {
        Configuration.baseUrl = "https://shop.garant21.ru/"; // Замените на ваш URL
        Configuration.startMaximized = true;
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

}
