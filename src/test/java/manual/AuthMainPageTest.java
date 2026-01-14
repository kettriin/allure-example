package manual;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Owner("e.shch")
@Feature("AuthMainPage")
public class AuthMainPageTest {

    @DisplayName("Успешная авторизация с главной страницы")
    @Test
    void mailMainPageAuthPositiveTest() {
        step("Перейти на главную mail.ru");
        step("Клик на кнопку Войти в правом верхнем углу");
        step("В инпут Имя ящика ввести адрес почты test_team@mail.ru");
        step("Нажать Войти");
        step("Перейти к вводу пароля", () -> {
            step("На форме VKID на экране ввода номера телефона нажать Пропустить");
            step("На экране VKID о быстрой авторизации нажать Пропустить");
        });
        step("Ввести пароль QWE123");
        step("Нажать Войти");
        step("На главной появилась аватарка пользователя в правом верхнем углу " +
                "и в меню пользователя в левом верхнем блоке под шапкой");
    }
}
