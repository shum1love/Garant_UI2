package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.xpath;

public class HeaderPage {
    // локатор кнопки Северодвинск в окне выбора города
    public final SelenideElement buttonSeverodvinsk = $(xpath(".//a[text()='Северодвинск']"));
    // локатор кнопки Архангельск в окне выбора города
    public final SelenideElement buttonArchangelsk = $(xpath(".//a[text()='Архангельск']"));
    // локатор кнопки Новодвинск в окне выбора города
    public final SelenideElement buttonNovodvinsk = $(xpath(".//a[text()='Новодвинск']"));
    // локатор кнопки крестик в окне выбора города
    public final SelenideElement buttonSitySelectClose = $(xpath(".//button[text()='×']"));
    // локатор окна подтверждения возраста
    public final SelenideElement windowAgeConfirmation = $(byId("popup_register"));
    // локатор кноки "Мне больше 18 лет"
    public final SelenideElement buttonOverEighteenYears = $(byText("Мне больше 18 лет"));
    // локатор кноки "Мне меньше 18 лет"
    public final SelenideElement buttonLessEighteenYears = $(byText("Мне меньше 18 лет"));


}
