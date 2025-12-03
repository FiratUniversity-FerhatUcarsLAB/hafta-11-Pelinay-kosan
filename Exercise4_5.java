
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
# Exercise 4.5 – zoop ikinci kez çağrıldığında stack diyagramı

İkinci zoop çağrısı şu satırdan geliyor:

clink(4) içinde:
    zoop("breakfast ", fork);  // fork = 4

Bu anda stack (en üstte aktif olan frame):

+------------------------------+
| Frame: zoop                  |
| fred = "breakfast "         |
| bob  = 4                    |
+------------------------------+
| Frame: clink                |
| fork = 4                    |
+------------------------------+
| Frame: main                 |
| bizz = 5                    |
| buzz = 2                    |
+------------------------------+

Bu çağrıda `bob == 5` olmadığı için `ping` çağrılmıyor,
sadece `"breakfast "` ve `"!"` yazılıyor.
