public class Exercise4_2 {

    public static void main(String[] args) {
        zippo("rattle", 13);                    // 1
    }

    public static void baffle(String blimp) {
        System.out.println(blimp);              // 5
        zippo("ping", -5);                      // 6
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {                         // 2, 7
            System.out.println(quince + " zoop"); // 8
        } else {
            System.out.println("ik");           // 3
            baffle(quince);                     // 4
            System.out.println("boo-wa-ha-ha"); // 9
        }
    }
}

/*
Çalışma sırası (numaralar):

1) main içindeki zippo("rattle", 13);
2) zippo içindeki if (flag < 0)   // ilk çağrıda
3) System.out.println("ik");
4) baffle(quince);
5) System.out.println(blimp);
6) zippo("ping", -5);
7) if (flag < 0)                  // ikinci çağrıda
8) System.out.println(quince + " zoop");
9) System.out.println("boo-wa-ha-ha");

baffle metoduna ilk gönderilen blimp parametresi:
    → "rattle"

Programın tam çıktısı:

ik
rattle
ping zoop
boo-wa-ha-ha
*/
