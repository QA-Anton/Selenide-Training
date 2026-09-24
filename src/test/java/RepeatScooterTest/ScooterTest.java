package RepeatScooterTest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class ScooterTest {

    @Test
    public void openScooterPage() {
        // Настройка (опционально): выбор браузера
        Configuration.browser = "chrome";

        // Открываем страницу
        open("https://qa-scooter.praktikum-services.ru/");

        // В Selenide не нужно писать команды ожидания, он сам ждет появления элементов
        // Просто проверяем, что какой-то элемент виден
        // Например, ищем кнопку "Заказать"
        $(".Button_Button__ra12g").shouldBe(com.codeborne.selenide.Condition.visible);
    }
}
