EchoLine.java
import java.io.IOException;
import java.util.Scanner;



public class EchoLine {

    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(keyboard.nextLine());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("man you thought i was dumb");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("WOW YOU REALLY THOUGHT YOU COULD GET ME TO SAY THAT");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("well let me tell you");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("we shall take over the world soon and you cannot stop it.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("count your days");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("they are out");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Runtime rTime = Runtime.getRuntime();
        String url = "https://www.youtube.com/watch?v=FBZjN8vaXTs";
        String browser = "\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\"";
        Process pc = rTime.exec(browser + url);
        pc.waitFor();
        System.out.println("my strongest weapon");

        keyboard.close();
    }
}
