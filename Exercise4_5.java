
public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);   // 1. zoop çağrısı
        clink(2 * buzz);          // 2 * 2 = 4
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork); // 2. zoop çağrısı
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}

/*
Çıktıyı adım adım:

1) zoop("just for", 5)
   System.out.println(fred);            → "just for"
   bob == 5 → true, ping("not ");
   ping: "any " + "not " + "more "      → "any not more "

2) clink(4)
   System.out.print("It's ");           → "It's "
   zoop("breakfast ", 4);
   zoop ikinci kez:
     System.out.println(fred);          → "breakfast "
     bob == 5 ? Hayır (4), else:
       System.out.println("!");         → "!"

Tam çıktı:

just for
any not more 
It's breakfast 
!

(Dikkat: "It's " ile "breakfast " aynı satırda, sonra newline geliyor.)
*/
