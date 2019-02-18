package it524.inner.ex2;

public class Book {

    private Publisher publisher;

    static class Publisher {

            // Private tanimladigim takdirde, main tarafindan erisimi olmuyor. Yani public, protected da olsa erisim var.
            String name;
            String country;

            // static yapsakta, public'de yapsakta main tarafindan erisimi var
            void print () {
                System.out.println("Hello World!");
            }
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Publisher getPublisher() {
        return publisher;
    }
}
