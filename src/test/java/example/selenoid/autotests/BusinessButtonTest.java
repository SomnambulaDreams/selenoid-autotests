package example.selenoid.autotests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


public class BusinessButtonTest {

    @Before
    public void setUp() {
        Selenide.open("https://elegro.eu/");
    }

    @Test
    public void checkBusinessButton() {
        Selenide.$(By.xpath("//header/div[2]/div[2]/div[1]/a")).click();
    }

    @Test
    public void checkPersonalButton() {
        Selenide.$(By.xpath("//header/div[2]/div[2]/div[2]/a")).click();
    }
}