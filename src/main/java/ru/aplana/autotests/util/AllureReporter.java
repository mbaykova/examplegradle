package ru.aplana.autotests.util;

import gherkin.formatter.model.Result;
import ru.aplana.autotests.steps.BaseSteps;



/**
 * Created by 777 on 08.05.2017.
 */
public class AllureReporter extends io.qameta.allure.cucumberjvm.AllureCucumberJvm{


    @Override
    public void result(Result result) {
        if ("failed".equals(result.getStatus())) takeScreenshot(result);
        super.result(result);
    }



    public void takeScreenshot(Result step) {
        if (BaseSteps.getDriver() != null) {
           BaseSteps.takeScreenshot();
        }
    }
}
