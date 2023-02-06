package com.example.Nike;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebsiteScraperDD {

    public static void main(String[] args) throws IOException, InterruptedException {
        SpringApplication.run(WebsiteScraperDD.class, args);
        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver",
                "D:\\0JAVA\\0PROJECTS\\0Nike\\chromedriver.exe");

//        driver.get("https://www.nike.com/w/sale-3yaep");
        driver.get("https://www.nike.com/w/sale-shoes-3rauvz3thmlz3yaepz4heq9znik1zy7ok");
        //pereryv
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //naiti knopku s kukami i najat' ok
        WebElement cookieButton = driver.findElement(By.cssSelector("button[data-var='acceptBtn1']"));
        cookieButton.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        while (true) {
            List<WebElement> priceWrappers = driver.findElements(By.cssSelector(".product-price__wrapper"));
            List<WebElement> elements = driver.findElements(By.cssSelector("[data-qa='product-card']"));
            if (priceWrappers.size() == 0) {
                break;
            }
            for (WebElement priceWrapper : priceWrappers) {
                WebElement currentPrice = priceWrapper.findElement(By.cssSelector(".product-price.is--current-price"));
                WebElement originalPrice = priceWrapper.findElement(By.cssSelector(".product-price.us__styling.is--striked-out"));
                try{
                    String originalPriceToInt = originalPrice.getText();
                    String currentPriceToInt = currentPrice.getText();
                    originalPriceToInt = originalPriceToInt.replace("$", "").replace(",", ".");
                    currentPriceToInt = currentPriceToInt.replace("$", "").replace(",", ".");
                    float currentPriceInt = Float.parseFloat(currentPriceToInt);
                    float originalPriceInt = Float.parseFloat(originalPriceToInt);
                    float discount = 100-((currentPriceInt*100)/originalPriceInt);
                    if (discount>45) {
                        System.out.println(discount + "%");
                        System.out.println("Current Price: " + currentPrice.getText());
                        System.out.println("Original Price: " + originalPrice.getText());
                    }
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }
            }
            js.executeScript("window.scrollBy(0, window.innerHeight);");
        }
        driver.quit();
    }
}

        /*String html = "https://www.nike.com/w/sale-3yaep";
        Document document = Jsoup.connect(html).get();
        Elements priceWrappers = document.select(".product-price__wrapper");
        for (int i = 0; i < priceWrappers.size(); i++) {
            Elements currentPrices = priceWrappers.get(i).select(".product-price.is--current-price");
            Elements originalPrices = priceWrappers.get(i).select(".product-price.us__styling.is--striked-out");
            System.out.println("Current Price: " + currentPrices.text());
            System.out.println("Original Price: " + originalPrices.text());
        }
    }*/
