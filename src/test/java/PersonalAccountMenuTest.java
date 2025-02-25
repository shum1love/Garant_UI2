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

public class PersonalAccountMenuTest {
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
    @DisplayName("Тест 1: Проверка открытия окна выбора города при нажатии на название города")
    @Description("")
    public void testCheckVisibleCitySelectWindow() {
        // Действие: клик по кнопке "Северодвинск"
        headerPageSteps.clickButtonSeverodvinsk();
        // Действие: клик по кнопке "Мне больше 18 лет" в окне подтверждения возраста
        //headerPageSteps.clickButtonOverEighteenYears();
        // Действие: клик по кнопке выбора города в шапке сайта
        headerPageSteps.clickCityHead();
        // Действие: проверка отображение окна выбора города
        headerPageSteps.checkVisibleCitySelectWindow();


    }
}
