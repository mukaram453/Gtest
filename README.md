Run the following command from command prompt

mvn test -Dbrowser=chrome

possible options chrome and firefox

I have used webdrivermanager for browser's system dependent webdrivers like chromedriver and geckodriver
 <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>2.2.1</version>
        </dependency>  

webdrivermanager advantages:
  1.  It checks the latest version of the WebDriver binary file
  2.  It downloads the binary WebDriver if it is not present in your system
  3.  It exports the required Java variable by Selenium WebDriver
