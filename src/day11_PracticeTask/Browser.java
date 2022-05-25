package day11_PracticeTask;

public class Browser {
    public static void main(String[] args) {

        String browserName = "chrome";
        String result ="";

        switch (browserName){
            case "chrome":
                result = "chrome";
            break;
            case "safari":
                result = "safari";
                break;
            case "firefox":
                result = "opera";
                break;
            case "edge":
                result = "edge";
                break;
            default:
                result = "Not valid Browser";
        }

        System.out.println(result);

    }
}
/*

3.  write a program that can display the selected browser
3.1  declare a String variable called browserName
3.2  Assume that the valid browsers are: chrome, firefox,
opera, safari, edge
3.3 if the browser name does not match with the valid
browsers' names, out put should be: Invalid Browser
Do Not use if statement or ternary
 */