//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.concurrent.TimeUnit;
//
//public class WhatsAppGroupAutomation {
//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Replace with your ChromeDriver path
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        
//        // Open WhatsApp Web
//        driver.get("https://web.whatsapp.com/");
//        
//        // Wait for user to scan the QR code manually
//        System.out.println("Scan the QR Code and press ENTER to continue...");
//        Thread.sleep(15000); // Adjust time based on QR scanning
//        
//        // Name of the group
//        String groupName = "Your Group Name";  // Replace with your group name
//
//        // Click on the group in WhatsApp Web
//        WebElement groupChat = driver.findElement(By.xpath("//span[@title='" + groupName + "']"));
//        groupChat.click();
//        
//        // Wait for chat to load
//        Thread.sleep(3000);
//        
//        // Locate the message input box
//        WebElement messageBox = driver.findElement(By.xpath("//div[@contenteditable='true']"));
//        messageBox.sendKeys("Hello, this is an automated message from Selenium!");
//        
//        // Click the send button
//        WebElement sendButton = driver.findElement(By.xpath("//button[@data-testid='send']"));
//        sendButton.click();
//        
//        // Close the browser after sending the message
//        Thread.sleep(2000);
//        driver.quit();
//    }
//}