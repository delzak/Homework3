package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by Алексей on 28.01.2019.
 */
public class MainSteps extends BaseSteps {

    @Step("Выбран пункт меню {0}")
    public void stepSelectMainMenu(String menuItem) {
        new MainPage(driver).selectMainMenu(menuItem);
    }

    @Step("Выбран вид страхования {0}")
    public void stepSelectSubMenu(String menuItem) {
        new MainPage(driver).selectSubMenu(menuItem);
    }
}
