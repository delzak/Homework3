package util;


import org.junit.runner.notification.Failure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;
import steps.BaseSteps;

/**
 * Created by Алексей on 28.01.2019.
 */
public class AllureListener extends ru.yandex.qatools.allure.junit.AllureRunListener {

    @Override
    public void testFailure(Failure failure) {
        takeScreenShot();
        super.testFailure(failure);
    }

    @Attachment(type = "image/png", value = "Скриншот при ошибке")
    public byte[] takeScreenShot() {
        return ((TakesScreenshot) BaseSteps.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
