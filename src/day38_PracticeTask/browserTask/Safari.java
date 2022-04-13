package day38_PracticeTask.browserTask;

public class Safari extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("Opening safari browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Safari Browser");
    }
}

/*
4. Safari extends Browser
methods:
openBrowser():
prints "opening safari browser"
closeBrowser():
prints "closing safari browser"
 */