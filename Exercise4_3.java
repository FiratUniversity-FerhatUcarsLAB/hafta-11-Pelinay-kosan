
public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}

/*
Program çıktısı (satır satır):

No, I wug.
You wugga wug.
I wug.

(Daha açık yazarsak, aradaki boşluklarla birlikte:)
"No, I " + "wug" + "." + \n
"You wugga " + "wug" + "." + \n
"I " + "wug" + "." + \n
*/
