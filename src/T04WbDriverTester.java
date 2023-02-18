public class T04WbDriverTester {
    public static void main(String[] args) {

        T04WebDriver[] drivers1= {new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};
        for (T04WebDriver driver1: drivers1){
            System.out.println(driver1.getTitle());
            driver1.open();
           // driver1.navigate(); is unavailable
            driver1.close();
        }


    }
}
