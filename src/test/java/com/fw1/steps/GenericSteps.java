package com.fw1.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GenericSteps {

    WebDriver driver;


    @Given("^user enter url$")
    public void user_enter_url() throws Throwable {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.johnlewis.com/");
        System.out.println("This is home page");

    }

    @When("^user search item in search field$")
    public void user_search_item_in_search_field() throws Throwable {

        driver.findElement(By.xpath("//*[@id='desktopSearch']")).sendKeys("Dresses");

        WebElement search = driver.findElement(By.xpath("//*[@id='desktopSearch']"));
        search.sendKeys(Keys.ENTER);

    }

    @Then("^user should see the search results$")
    public void user_should_see_the_search_results() throws Throwable {
String searchresult= driver.findElement(By.xpath("/html/body/main/div[3]/div[1]/h1")).getText();
System.out.println(searchresult);

    }


}
