package fileuploadonedrive;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class fupload {


public static void main(String[] args) throws InterruptedException, Exception {
	        // TODO Auto-generated method stub

	    
	    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://www.microsoft.com/en-ww/microsoft-365/onedrive/online-cloud-storage");
	    driver.manage().window().maximize();
	    //Thread.sleep(3000);
	    long start = System.currentTimeMillis();//--
	    driver.findElement(By.cssSelector("#office-Hero5050-ok1mqy3 > section > div > div:nth-child(1) > div > div > div > div > div:nth-child(1) > a")).sendKeys(Keys.ENTER);
	    //Thread.sleep(1000);
	    ArrayList<String>tabs =new
	    ArrayList<String>(driver.getWindowHandles());
	    
	    
	    driver.switchTo().window(tabs.get(1));
	    //Thread.sleep(2000);//-----
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Sign in']")));
	    
	    
	    
	    
	    // ----------------------------------------Login--------------------------------------------------
	    System.out.println(driver.getTitle());
	    Thread.sleep(2000);//--
	    driver.findElement(By.xpath("//input[@type='email' and @class='form-control']")).sendKeys("01309010117");
	    //Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    //Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Ur@123456789"); 
	    driver.findElement(By.id("idSIButton9")).click();
	   
	    

	    // Going into the Document folder 	
	    driver.findElement(By.xpath("//span[text()='Documents']")).click();
	    
	    
	    
	    
	    		
	    //-----------------------------File with contents upload------------------------------------------ 
	    // Clicking on the UPLOAD button
	    Thread.sleep(1800);
	    driver.findElement(By.xpath("//span[text()='Upload']")).click();
	 
	    Thread.sleep(1300);
	    // Clicking on the FILES button under the UPLOAD dropdown 	   
	    driver.findElement(By.xpath("//span[text()='Files']")).click();

	   // driver.findElement(By.xpath("//span[text()='Files']")).sendKeys("C:\\Users\\maruf.rahman\\Desktop\\demo.txt");
	 

	    Runtime.getRuntime().exec("D:\\FileUploadScript.exe");
	    Thread.sleep(3000);
	    
	    
	    String uploadedItem = driver.findElement(By.className("OperationMonitor-itemName")).getText();
	    while(!uploadedItem.contains("Uploaded")) {
	    	uploadedItem = driver.findElement(By.className("OperationMonitor-itemName")).getText();
	    }
	    System.out.println(uploadedItem);


	    

	    Thread.sleep(3000);

	    
	    driver.findElement(By.xpath("//span[text()='demo.txt']")).click();
	    
	    
	    
	    //------------------Downloading File---------------------------------------------------------------------------------------
	    
	    driver.findElement(By.xpath("(//span[text()='Download'])[2]")).click();
	    
	    
	    
	    
	    //-------------------Details of the uploaded file by pressing the INFO button----------------------------------------------
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//i[@data-icon-name='Info'])[2]")).click();
	    
	    
	    
	    
	    
	    
	    //-----------------Updating contents within a file 
	    //Thread.sleep(3000);
	    //driver.findElement(By.xpath("//span[text()='Open']")).click();
	    //driver.findElement(By.xpath("//span[text()='Open in Text Editor']")).click();
	    //driver.findElement(By.className("TextEditor")).sendKeys("01309010117");
		// driver.findElement(By.xpath("//div[4]/div[. = 'File with contents ']")).click();
		// driver.findElement(By.xpath("//textarea")).sendKeys("File with contents tttttttttt\\noooooooooo\\n000000000\\nkkkkkk\\n");
	    
	    
	    
	    
	    // ----------------Deleting the file----------------------------------------------------------------------
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Delete']")).click();
	    
	    
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//span[text()='OneDrive']")).click();
	    
	    
	    
	  
	    
	    //-----------------------------0 Byte File Upload------------------------------------------ 
	    // Going into the Document folder 	
	    driver.findElement(By.xpath("//span[text()='Documents']")).click();
	    // Clicking on the UPLOAD button
	    Thread.sleep(1800);
	    driver.findElement(By.xpath("//span[text()='Upload']")).click();
	 
	    Thread.sleep(1300);
	    // Clicking on the FILES button under the UPLOAD dropdown 	   
	    driver.findElement(By.xpath("//span[text()='Files']")).click();

	   // driver.findElement(By.xpath("//span[text()='Files']")).sendKeys("C:\\Users\\maruf.rahman\\Desktop\\demo.txt");
	 

	    Runtime.getRuntime().exec("D:\\zerofileupload.exe");
	    Thread.sleep(3000);
	    
	    
	    String uploadedItem1 = driver.findElement(By.className("OperationMonitor-itemDescription")).getText();
	    while(!uploadedItem1.contains("upload empty")) {
	    	uploadedItem1 = driver.findElement(By.className("OperationMonitor-itemDescription")).getText();
	    }
	    System.out.println(uploadedItem1);



	    
	    
	    
	    
	    
	    //------------------Counting total time to run the test cases------------------------------------------------
	    
	    long finish = System.currentTimeMillis();
	    long totalTime = finish - start; 
	    System.out.println("Total Time to execute the test cases - "+totalTime); 

	    }	
	
	
	
	
}
