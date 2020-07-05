package goibiboPageAndMethods.page;

import org.openqa.selenium.By;

public interface goibibo_Home {

    public static final By selectOneWay = By.xpath("//span[@id='oneway']");
    public static final By selectRoundTrip = By.xpath("//span[@id='roundTrip']");
    public static final By selectMultiCity = By.xpath("//span[@id='multiCity']");

    public static final By fieldFrom = By.xpath("//input[@id='gosuggest_inputSrc']");
    public static final By fieldTo = By.xpath("//input[@id='gosuggest_inputDest']");

    public static By departureDate = By.xpath("//input[@id='departureCalendar']");
    public static final By buttonSubmit = By.xpath("//button[@id='gi_search_btn']");



}
