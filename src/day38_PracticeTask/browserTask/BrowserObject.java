package day38_PracticeTask.browserTask;

public class BrowserObject {

    public static void main(String[] args) {

        Chrome chrome = new Chrome();

        Opera opera = new Opera();

        Firefox firefox = new Firefox();

        Safari safari = new Safari();

        chrome.openBrowser();
        chrome.closeBrowser();

        System.out.println("----------------------------------------");

        opera.openBrowser();
        opera.closeBrowser();

        System.out.println("----------------------------------------");

        firefox.openBrowser();
        firefox.closeBrowser();

        System.out.println("----------------------------------------");

        safari.openBrowser();
        safari.closeBrowser();









    }

}
