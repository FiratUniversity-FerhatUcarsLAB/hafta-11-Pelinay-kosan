
public class Exercise4_4 {

    // value (değer döndüren) method
    public static double square(double x) {
        return x * x;
    }

    // void method
    public static void sayBoo() {
        System.out.println("boo!");
    }

    public static void main(String[] args) {

        // 1) Değer döndüren metodu çağırıp sonucu kullanmamak:
        square(5.0); // Bu derlenir ve çalışır, sadece sonucu hiçbir yere kaydetmezsiniz.

        // 2) void metodu ifadenin içinde kullanmak:
        // Aşağıdaki satırı açarsan derleme HATASI verir:
        // double test = sayBoo() + 7;

        // Hata: "void method cannot be used in an expression" benzeri bir şey olacaktır.
    }
}

/*
Cevaplar (Türkçe özet):

1) Değer döndüren metodu çağırıp sonucu kullanmazsan ne olur?
   → Program sorunsuz derlenir ve çalışır. Metot yine hesaplar, geri döner ama
     sonucu hiçbir değişkende tutulmadığı için "çöpe gider". Derleyici uyarı verebilir
     ama hata değildir.

2) void metodu bir ifadenin içinde kullanırsan ne olur?
   → Derleyici HATA verir.
     Çünkü void metotlar değer döndürmez; +, -, vs. ile kullanılan bir ifade içinde
     kullanılmaları mümkün değildir.
*/
