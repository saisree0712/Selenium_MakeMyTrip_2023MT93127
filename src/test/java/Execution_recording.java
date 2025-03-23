import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.monte.media.Format;
import org.monte.media.FormatKeys.*;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.Base;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import pageobjectsM.Flights;
import pageobjectsM.Trains;

public class Execution_recording extends Base {
	 private static ATUTestRecorder recorder;

	    public static void startRecording(String fileName) throws ATUTestRecorderException {
	        recorder = new ATUTestRecorder("files_ss/", fileName, false);
	        recorder.start();
	    }

	    public static void stopRecording() throws ATUTestRecorderException {
	        recorder.stop();
	    }
	
    

    @BeforeClass
    public void browser() throws Exception {
        loadDataProperties();
        driver = initializeBrowser(prop.getProperty("browser"));

        // ✅ Start Recording at the Beginning
        startRecording("SeleniumTest");

        driver.get(prop.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // ✅ Handle Pop-ups Properly
        try {
            WebElement closePopup = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
            if (closePopup.isDisplayed()) {
                closePopup.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("No pop-up found, continuing.");
        }

        // ✅ Capture Screenshot After Browser Opens
        File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src1, new File("files_ss/BrowseropenTravel.png"));
    }

    @AfterClass
    public void teardown() throws Exception {
        stopRecording();
        driver.quit();
    }

    @Test
    public void searchtrains() throws IOException {
        Flights flights = new Flights(driver);
        Trains trains = new Trains(driver);

        trains.trains();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        flights.fromcity();
        flights.fromcityinput(prop.getProperty("Fromstation"));
        trains.Fromstation();

    //    flights.tocity();
        flights.ArrivalCityinput(prop.getProperty("ToStation"));
        trains.tostation();

        flights.selectDate();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        trains.trainclass();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        flights.searchbutton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        trains.Checkbox1stclassAC();

        // ✅ Capture Screenshot After Search
        File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src1, new File("files_ss/searchtrains.png"));
    }
}
