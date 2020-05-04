package example.selenoid.autotests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;


public class FirstTest {

    @Test
    public void checkNavigation() throws InterruptedException {
        Selenide.open("https://elegro.eu/");
        Selenide.$(By.xpath("//header/div[2]/div[2]/div[1]/a")).click();

//        Thread.sleep(5000);
//        Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/courses\"]").click();
//        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Курсы"));
//
//        Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/events\"]").click();
//        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Вебинары"));
//
//        Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/topics\"]").click();
//        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Форум"));
//
//        Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/posts\"]").click();
//        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Блог"));
//
//        Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/tests\"]").click();
//        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Тесты"));
//
//        Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/career\"]").click();
//        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Карьера"));
    }
}