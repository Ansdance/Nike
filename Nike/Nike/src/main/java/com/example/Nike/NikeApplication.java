//package com.example.Nike;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.select.Elements;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//@SpringBootApplication
//public class NikeApplication {
//
//    public static void main(String[] args) throws IOException {
//        String html = "https://www.nike.com/w/sale-3yaep";
//        Document document = Jsoup.connect(html).get();
//
//
//        WebDriver driver = new ChromeDriver();
//
//        System.setProperty("webdriver.chrome.driver",
//                "D:\\0JAVA\\0PROJECTS\\0Nike\\chromedriver.exe");
//
////        driver.get("https://www.nike.com/w/sale-3yaep");
//        driver.get("https://www.nike.com/w/sale-shoes-3rauvz3thmlz3yaepz4heq9znik1zy7ok");
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        WebElement cookieButton = driver.findElement(By.cssSelector("button[data-var='acceptBtn1']"));
//        cookieButton.click();
//        Elements priceWrappers = document.select(".product-price__wrapper");
//        for (int i = 0; i < priceWrappers.size(); i++) {
//            Elements currentPrices = priceWrappers.get(i).select(".product-price.is--current-price");
//            Elements originalPrices = priceWrappers.get(i).select(".product-price.us__styling.is--striked-out");
//            System.out.println("Current Price: " + currentPrices.text());
//            System.out.println("Original Price: " + originalPrices.text());
//        }
//    }}
//
//
////rabochii variant
//		  /*  String html = "https://www.nike.com/w/sale-3yaep";
//			Document document = Jsoup.connect(html).get();
//			Elements priceWrappers = document.select(".product-price__wrapper");
//			for (int i = 0; i < priceWrappers.size(); i++) {
//				Elements currentPrices = priceWrappers.get(i).select(".product-price.is--current-price");
//				Elements originalPrices = priceWrappers.get(i).select(".product-price.us__styling.is--striked-out");
//				System.out.println("Current Price: " + currentPrices.text());
//				System.out.println("Original Price: " + originalPrices.text());
//			}*/
//			/*OkHttpClient client = new OkHttpClient();
//			String endpoint = "https://www.nike.com/w/sale-3yaep";
//
//			int page = 0;
//			while (true) {
//				Request request = new Request.Builder()
//						.url(endpoint + "?page=" + page)
//						.build();
//
//				Response response = client.newCall(request).execute();
//				String content = response.body().string();
//				System.out.println(content);
//				// Parse the content to extract the information you need
//				// ...
//
//				page++;
//			}
//		}
//	}*/
//
//
//
//		  /*  String url = "https://www.nike.com/w/sale-3yaep";
//			while (url != null) {
//				// Connect to the website and fetch the HTML content
//				Document doc = Jsoup.connect(url).get();
//				// Use CSS selectors to extract the information you need
//	//            Elements items = doc.select(".product-card");
//				Elements priceWrappers = doc.select(".product-price__wrapper");
//				if (priceWrappers.size() == 0) {
//					break;
//				}
//				for (int i = 0; i < priceWrappers.size(); i++) {
//					Elements currentPrices = priceWrappers.get(i).select(".product-price.is--current-price");
//					Elements originalPrices = priceWrappers.get(i).select(".product-price.us__styling.is--striked-out");
//					System.out.println("Current Price: " + currentPrices.text());
//					System.out.println("Original Price: " + originalPrices.text());
//				}
//
//				// Find the link to the next page
//				Elements nextPageLinks = doc.select(".next-page");
//				if (nextPageLinks.size() > 0) {
//					url = nextPageLinks.first().attr("href");
//				} else {
//					url = null;
//				}
//			}
//		}
//	}*/
//
//
//
//
//
//
//
//		  /*  SpringApplication.run(NikeApplication.class, args);
//			System.setProperty("webdriver.chrome.driver",
//					"C:\\Users\\daule\\Downloads\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.get("https://www.nike.com/w/sale-3yaep");
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			while (true) {
//				List<WebElement> priceWrappers = driver.findElements(By.cssSelector(".product-price__wrapper"));
//				if (priceWrappers.size() == 0) {
//					break;
//				}
//				for (WebElement priceWrapper : priceWrappers) {
//					WebElement currentPrice = priceWrapper.findElement(By.cssSelector(".product-price.is--current-price"));
//					WebElement originalPrice = priceWrapper.findElement(By.cssSelector(".product-price.us__styling.is--striked-out"));
//					System.out.println("Current Price: " + currentPrice.getText());
//					System.out.println("Original Price: " + originalPrice.getText());
//				}
//				js.executeScript("window.scrollBy(0, window.innerHeight);");
//			}
//			driver.quit();
//		}
//	}*/
//
//
//
//			/*int page = 1;
//			while (true) {
//				Document document = Jsoup.connect("https://www.nike.com/w/sale-3yaep?page=" + page).get();
//				Elements priceWrappers = document.select(".product-price__wrapper");
//				if (priceWrappers.size() == 0) {
//					break;
//				}
//				for (int i = 0; i < priceWrappers.size(); i++) {
//					Elements currentPrices = priceWrappers.get(i).select(".product-price.is--current-price");
//					Elements originalPrices = priceWrappers.get(i).select(".product-price.us__styling.is--striked-out");
//					System.out.println("Current Price: " + currentPrices.text());
//					System.out.println("Original Price: " + originalPrices.text());
//					System.out.println("________________________________________________________");
//				}
//				System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
//				page++;
//			}
//		}
//	}*/
//
//
////		for (Element priceWrapper : priceWrappers) {
////			priceWrapper.
////			String currentPrice = priceWrapper.first().select(".product-price.is--current-price").text();
////			String originalPrice = priceWrapper.first().select(".product-price.us__styling.is--striked-out").text();
////			System.out.println("Current Price: " + currentPrice);
////			System.out.println("Original Price: " + originalPrice);
////		}
//
//
////		String currentPrice = priceWrapper.first().select(".product-price.is--current-price").text();
////		String originalPrice = priceWrapper.first().select(".product-price.us__styling.is--striked-out").text();
////		System.out.println("Current Price: " + currentPrice);
////		System.out.println("Original Price: " + originalPrice);
////
////	}
////}
////		Document document = Jsoup.connect("https://www.nike.com/w/sale-3yaep").get();
////		Elements productTitle = document.select(".product-card__title");
////		System.out.println("First product title: " + productTitle.first().text());
//
//
//
//			/*Document doc = Jsoup.connect("https://www.nike.com/w/sale-3yaep").get();  ryadonm no ne to html = "https://www.nike.com/w/sale-3yaep";
//			Document document = Jsoup.parse(html);
//			Elements productPrices = document.select(".product-price__wrapper");
//			for (Element productPrice : productPrices) {
//				String currentPrice = productPrice.select(".product-price.is--current-price").text();
//				String originalPrice = productPrice.select(".product-price.is--striked-out").text();
//				System.out.println("Current Price: " + currentPrice);
//				System.out.println("Original Price: " + originalPrice);
//			}
//
//
//			Elements productElements = doc.select(".product-card");
//			for (Element productElement : productElements) {
//				String discountPercent = productElement.select(".discount-badge").text();
//				if (discountPercent.endsWith("%")) {
//					discountPercent = discountPercent.substring(0, discountPercent.length() - 1);
//					int discount = Integer.parseInt(discountPercent);
//					if (discount > 40) {
//						String productName = productElement.select(".product-card-title").text();
//						System.out.println(productName + " is on sale with " + discountPercent + "% discount");
//					}
//				}
//			}
//		}
//	}*/
//
//
//			/*Document document = Jsoup.connect("https://www.nike.com/w/sale-3yaep-3yaep").get();
//			Elements elements = document.select("[data-qa='product-card']");
//
//			ArrayList<String> discountedProducts = new ArrayList<>();
//
//			for (Element element : elements) {
//				String discount = element.select("[data-qa='discounted-price']").text();
//				if (!discount.isEmpty()) {
//					int discountPercentage = 100 - (int) (Double.parseDouble(discount.substring(1)) * 100 / Double.parseDouble(element.select("[data-qa='original-price']").text().substring(1)));
//					if (discountPercentage > 40) {
//						discountedProducts.add(element.select("[data-qa='product-title']").text());
//					}
//				}
//			}
//
//			System.out.println("Discounted products: " + discountedProducts);
//		}
//	}*/
//			/*try {
//				Document doc = Jsoup.connect("https://www.nike.com/w/sale-3yaep").get();
//				Elements discountedItems = doc.select("[data-discount-percentage>40]");
//				for (Element item : discountedItems) {
//					String itemName = item.select("h3").text();
//					String itemPrice = item.select(".product-price").text();
//					String itemDiscount = item.attr("data-discount-percentage");
//					System.out.println("Item: " + itemName + ", Price: " + itemPrice + ", Discount: " + itemDiscount + "%");
//				}
//			} catch (IOException e) {
//				System.out.println("Unable to access website: " + e.getMessage());
//			}
//		}
//	}*/
//			/*String url = "https://www.nike.com/sale";
//
//			// Use Jsoup to connect to the website and retrieve the HTML content
//			Document doc = Jsoup.connect(url).get();
//
//			// Select all elements with the class "product-card-container"
//			Elements productCards = doc.select(".product-card-container");
//
//			// Iterate through each product card
//			for (Element productCard : productCards) {
//				// Select the discount percentage
//				Elements discountPercentage = productCard.select(".discount-percentage");
//
//				// Check if the discount is greater than 40%
//				if (!discountPercentage.isEmpty() &&
//						Double.parseDouble(discountPercentage.text().replace("%", "")) > 20) {
//					// Select the product name
//					String productName = productCard.select(".product-card-title").text();
//
//					// Select the product URL
//					String productUrl = productCard.select(".product-card-title").attr("href");
//
//					// Log the product information
//					System.out.println(productName + ": " + productUrl);
//				}
//			}
//		}
//
//	}*/
