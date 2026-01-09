package manual;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Owner("e.shch")
@Feature("AuthMainPage")
public class AddUserMainPageTest {

    @Story("Успешная авторизация мультиаккаунта с главной страницы")
    @Test
    void mailMainPageAddUserAuthPositiveTest() {
        step("Перейти на главную mail.ru");
        step("Авторизоваться существующим пользователем");
        step("Клик на дропдаун блока пользователя в левом верхнем углу под шапкой");
        step("Нажать Добавить почтовый ящик");
        step("В инпут Имя ящика ввести адрес почты test_team@mail.ru");
        step("Нажать Войти");
        step("Перейти к вводу пароля", () -> {
            step("На форме VKID на экране ввода номера телефона нажать Пропустить");
            step("На экране VKID о быстрой авторизации нажать Пропустить");
        });
        step("Ввести пароль QWE123");
        step("Нажать Войти");
        step("На главной в меню пользователя в левом верхнем блоке под шапкой " +
                "появилась УЗ второго пользователяп сразу под УЗ первого авторизованного пользователя");
    }
}
