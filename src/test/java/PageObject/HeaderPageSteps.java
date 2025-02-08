package PageObject;

import PageObject.HeaderPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.image;
import static com.codeborne.selenide.Condition.visible;

public class HeaderPageSteps {
    private HeaderPage headerPage;

    // Конструктор для передачи объекта HeaderPage
    public HeaderPageSteps(HeaderPage headerPage) {
        this.headerPage = headerPage;
    }

    // Метод клика по кнопке "Северодвинск"
    public void clickButtonSeverodvinsk() {
        headerPage.buttonSeverodvinsk.click();
    }
    // Метод клика по кнопке крестик
    public void clickButtonSitySelectClose() {
        headerPage.buttonSitySelectClose.click();
    }

    // Окно подтверждения возраста
    // Метод клика по кнопке "Мне больше 18 лет"
    public void clickButtonOverEighteenYears(){
        headerPage.buttonOverEighteenYears.click();
    }
    // Метод клика по кнопке "Мне меньше 18 лет"
    public void clickButtonLessEighteenYears(){
        headerPage.buttonLessEighteenYears.click();
    }
    // Метод клика по крестику в окне подтверждения возраста
    public void clickButtonCloseAgeConfirmation(){
        headerPage.buttonCloseAgeConfirmation.click();
    }
    // Метод клика по крестику в окне подтверждения возраста
    public void visibleWindowAgeVerefication(){
        headerPage.windowAgeConfirmation.shouldBe(visible);
    }

    // Страница с алкоголем
    // Клик по списку "Каталог товаров"
    public void clickListProductCatalog(){
        HeaderPage.listProductCatalog.click();
    }
    // Клик по вкладке "Алкоголь"
    public void clickTabAlcohol(){
        HeaderPage.tabAlcohol.click();
    }
    // Клик по вкладке "Пиво и слабоалкогольные напитки"

    // Проверяем, что все изображения алкоголя имеют класс 'blur'
    public void checkAllAlcoholImagesAreBlurred() {
        HeaderPage.alcoholImages.forEach(image ->
                image.shouldHave(Condition.attribute("class", "img-responsive 18plus blur"))
        );
    }


}
