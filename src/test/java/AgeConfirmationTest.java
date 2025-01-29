import PageObject.HeaderPage;
import PageObject.HeaderPageSteps;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import jdk.jfr.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;

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
    @DisplayName("Тест 1: Проверка отображения окна подтверждения возраста")
    @Description("Окно подтверждения возраста должно появится сразу после окна выбора города для неавторизированного пользователя")
    public void testClickButtonSeverodvinsk() {
        // Действие: клик по кнопке "Северодвинск"
        headerPageSteps.clickButtonSeverodvinsk();
        // Действие: отображение оуна подтверждения возраста
        headerPageSteps.visibleWindowAgeVerefication();
    }
    @Test
    public void testClickButtonCitySelectClose() {
        // Действие:
        headerPageSteps.clickButtonSitySelectClose();
        headerPageSteps.clickButtonCloseAgeConfirmation();
    }
    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}
