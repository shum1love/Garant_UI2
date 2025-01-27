package PageObject;

import PageObject.HeaderPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
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
    // Метод клика по кнопке "Мне больше 18 лет"
    public void clickButtonOverEighteenYears(){
        headerPage.buttonOverEighteenYears.click();
    }
    // Метод клика по кнопке "Мне больше 18 лет"
    public void clickButtonLessEighteenYears(){
        headerPage.buttonLessEighteenYears.click();
    }
}
