import PageObject.HeaderPage;
import PageObject.HeaderPageSteps;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import jdk.jfr.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
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
        // Действие: Проверка на отображение окна подтверждения возраста
        headerPageSteps.visibleWindowAgeVerefication();
    }
    @Test
    @DisplayName("Тест 2: Проверка закрытия окна при нажатии на кнопку 'Мне больше 18 лет'")
    public void testClickButtonCitySelectClose() {
        // Действие: клик по кнопке "Закрыть" в окне выбора города
        headerPageSteps.clickButtonSitySelectClose();
        // Действие: клик по кнопке "Мне больше 18 лет" в окне подтверждения возраста
        headerPageSteps.clickButtonOverEighteenYears();
        // Действие: Проверка на исчезание окна подтверждения возраста
        headerPage.windowAgeConfirmation.shouldNotBe(visible);
    }
    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}
