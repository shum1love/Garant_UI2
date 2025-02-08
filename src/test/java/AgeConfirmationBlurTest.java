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

public class AgeConfirmationBlurTest {
    private HeaderPage headerPage;
    private HeaderPageSteps headerPageSteps;
    @BeforeEach
    public void setUp() {
        Configuration.baseUrl = "https://shop.garant21.ru/alkogol";
        Configuration.browserSize = "1920x1080";// Запускает браузер в полноэкранном режиме
        open("/");

        // Инициализация объектов страниц
        headerPage = new HeaderPage();
        headerPageSteps = new HeaderPageSteps(headerPage);
    }
    @Test
    @DisplayName("Тест 5: Проверка отображения карточек с алкоголем при нажатии на кнопку 'Мне больше 18 лет'")
    public void testCheckAllAlcoholImagesVisible(){
        // Действие: клик по кнопке "Закрыть" в окне выбора города
        headerPageSteps.clickButtonSitySelectClose();
        // Действие: клик по кнопке "Мне больше 18 лет" в окне подтверждения возраста
        headerPageSteps.clickButtonOverEighteenYears();
        // Действие: Проверка отображения карточек с алкоголем
        headerPageSteps.checkAllAlcoholImagesVisible();
    }
    @Test
    @DisplayName("Тест 6: Проверка замыливания карточек с алкоголем при нажатии на кнопку 'Мне меньше 18 лет'")
    public void testCheckAllAlcoholImagesAreBlurred(){
        // Действие: клик по кнопке "Закрыть" в окне выбора города
        headerPageSteps.clickButtonSitySelectClose();
        // Действие: клик по кнопке "Мне меньше 18 лет" в окне подтверждения возраста
        headerPageSteps.clickButtonLessEighteenYears();
        // Действие: Проверка замыливания карточек с алкоголем
        headerPageSteps.checkAllAlcoholImagesAreBlurred();
    }
    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
