package qa.guru.owner.homework;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ForecastTest extends TestBase{

    @Test
    public void testForecast() {
        open("");
        $(".yandex-header__content").shouldHave(text("Прогноз"));
    }
}
