package it524.inner.ex2;


public class Main {
    public static void main(String[] args) {

        /*
            Inner Class - Static Example
         */

        // Ancak bu sekilde instantiate edilebiliyor. Book yazilmazsa hata veriyor
        Book.Publisher publisher = new Book.Publisher();

        publisher.name = "Fred";

        Book b1 = new Book();
        b1.setPublisher(publisher);

        Book b2 = new Book();
        b2.setPublisher(publisher);

        publisher.name = "Jon";


        // Behaves like a normal static member of enclosing class
        System.out.println(b1.getPublisher().name);
        System.out.println(b2.getPublisher().name);

        // Output Jon-Jon oluyor. Halbuki ilk b1'i yaratirken ismini Fred vermistik. Class statik de olsa, icerisindeki alanlar'da statik
        // gibi davraniyor

    }
}