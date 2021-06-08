package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting: world's smallest cat - BBC");
        int seconds = 0;

        while(seconds <= 117) {
            System.out.println("\uD83C\uDF1E Watching cat video: " + seconds);
            seconds++;
            Thread.sleep(1000);
        }
        System.out.println("Finished watching cat video");
        System.out.println("Let's start another one");
    }
}
