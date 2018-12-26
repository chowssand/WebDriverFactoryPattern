package com.qa.factorypattern;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
    protected abstract void startService();
    protected abstract void stopService();
    protected abstract void createDriver();

    protected WebDriver driver;

    public WebDriver getDriver(){
        if(null == driver){
            startService();
            stopService();
        }
        return driver;
    }

    public void quitDriver(){
        if(null != driver){
            driver.quit();
            driver = null;
        }
    }

}
