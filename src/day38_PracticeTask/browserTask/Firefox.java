package day38_PracticeTask.browserTask;

public class Firefox extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening Firefox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox Browser");
    }
}
/*
2. FireFox extends Browser
methods:
openBrowser():
prints "opening firefox browser"
closeBrowser():
prints "closing fire fox browser"
 */