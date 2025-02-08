package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
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

    // Окно подтверждения возраста
    // локатор окна подтверждения возраста
    public final SelenideElement windowAgeConfirmation = $(byXpath(".//div[@class='modal-content']"));
    // локатор кноки "Мне больше 18 лет"
    public final SelenideElement buttonOverEighteenYears = $(byText("Мне больше 18 лет"));
    // локатор кноки "Мне меньше 18 лет"
    public final SelenideElement buttonLessEighteenYears = $(byText("Мне меньше 18 лет"));
    // локатор крестика в окне подтверждения возраста
    public final SelenideElement buttonCloseAgeConfirmation = $(byXpath(".//button[@class='close' and text()='×']"));

    // Страница с алкоголем
    // Список "Каталог товаров"
    public static final SelenideElement listProductCatalog = $(byClassName("menu__header"));
    // Вкладка "Алкоголь"
    public static final SelenideElement tabAlcohol = $(byXpath("//*[@id=\"category-module\"]/ul/li[8]/a/text()"));
    // Вкладка "Пиво и слабоалкогольные напитки"
    public static final SelenideElement tabBeerLowAlcoholDrinks = $(byXpath(".//*[@id=\"category-module\"]/ul/li[8]/div/a[1]"));
    // Все карточки алкоголя на странице
    public static final ElementsCollection alcoholImages = $$(byXpath("//div[contains(@class, 'product-thumb__image')]//img[contains(@class, '18plus')]"));


}
