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

    // Шапка сайта
    // Клик по городу в шапке сайта
    public void clickCityHead(){
        headerPage.cityHead.click();
    }
    // Клик по "Оплата и доставка" в шапке сайта
    public void clickPayDeliveryHead(){
        headerPage.payDeliveryHead.click();
    }
    // Клик по "Контакты и схема проезда" в шапке сайта
    public  void clickContactsDirectionsHead(){
        headerPage.contactsDirectionsHead.click();
    }
    // Клик по "Бонусная программа" в шапке сайта
    public  void clickBonusProgramHead(){
        headerPage.bonusProgramHead.click();
    }
    // Клик по "Личный кабинет" в шапке сайта
    public  void clickPrivateAccountHead(){
        headerPage.privateAccountHead.click();
    }



    //Окно выбора города
    // Метод клика по кнопке "Северодвинск"
    public void clickButtonSeverodvinsk() {
        headerPage.buttonSeverodvinsk.click();
    }
    // Метод клика по кнопке крестик
    public void clickButtonCitySelectClose() {
        headerPage.buttonCitySelectClose.click();
    }
    // Проверка отображения окна выбора города
    public void checkVisibleCitySelectWindow(){
        headerPage.citySelectWindow.shouldBe(visible);
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
    // Метод проверки отображения окна подтверждения возраста
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
    public void clickTabBeerLowAlcoholDrinks(){
        HeaderPage.tabBeerLowAlcoholDrinks.click();
    }
    // Проверяем, что все изображения алкоголя не имеют класс 'blur'
    public void checkAllAlcoholImagesVisible() {
        HeaderPage.alcoholImages.forEach(image ->
                image.shouldNotHave(Condition.attribute("class", "img-responsive 18plus blur"))
        );
    }

    // Проверяем, что все изображения алкоголя имеют класс 'blur'
    public void checkAllAlcoholImagesAreBlurred() {
        HeaderPage.alcoholImages.forEach(image ->
                image.shouldHave(Condition.attribute("class", "img-responsive 18plus blur"))
        );
    }


}
