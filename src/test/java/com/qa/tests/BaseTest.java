package com.qa.tests;

import com.qa.factorypattern.DriverManager;
import com.qa.factorypattern.DriverManagerFactory;
import com.qa.factorypattern.DriverTypes;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {
    DriverManager driverManager;
    WebDriver driver;

    @BeforeClass
    public void beforeTest(){
        driverManager = DriverManagerFactory.getManager(DriverTypes.CHROME);
    }

    @BeforeMethod
    public void beforeMethod(){
         driver = driverManager.getDriver();
    }
    @AfterMethod
    public void afterMethod() {
        driverManager.quitDriver();

    }



}
