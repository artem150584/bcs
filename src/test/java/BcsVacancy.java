import org.junit.Test;
import org.openqa.selenium.By;

import java.util.logging.Logger;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BcsVacancy {
    private Logger log = Logger.getLogger(BcsVacancy.class.getName());

    @Test
    public void checkQaResponsibility() {
        final int responsibilityNumber = 7;
        final String vacancy = "QA микросервисов";

        log.info("Check responsibility numbers for: " + vacancy);

        open("http://google.com");
        $(By.name("q")).setValue("вакансии фг бкс брокерские услуги акции финансы новосибирск").pressEnter();
        $("#rso > div:nth-child(1)").click();

        $(By.linkText(vacancy)).$$(By.xpath("../div/ul[1]/li")).shouldHave(size(responsibilityNumber));


        log.info("Test has been completed successfully");
    }
}


