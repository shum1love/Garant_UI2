package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HeaderPage {
    // локатор кнопки Северодвинск в окне выбора города
    @FindBy(how = How.LINK_TEXT,using = "Северодвинск")
    public SelenideElement buttonSeverodvinsk;
}
