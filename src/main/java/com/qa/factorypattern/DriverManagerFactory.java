package com.qa.factorypattern;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverTypes type) {
        DriverManager driverManager=null;
        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            /*case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            default:
                driverManager = new SafariDriverManager();
                break;*/
        }
        return driverManager;

    }
}
