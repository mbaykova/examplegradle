package ru.aplana.autotests.steps;


import io.qameta.allure.Step;
import ru.aplana.autotests.pages.MainPage;


/**
 * Created by Maria on 29.04.2017.
 */
public class MainPageSteps {



    @Step("выбран пункт меню {menuItem}")
    public void selectMenuItem(String menuItem){
        new MainPage().selectMenuItem(menuItem);
    }

    @Step("выбран вид страхования {menuItem}")
    public void selectMenuInsurance(String menuItem){
        new MainPage().selectInsuranceItem(menuItem);
    }

}
