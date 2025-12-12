package Grafipel;

public class Application {
    public static void main(String[] args) {
        Person[]person = new Person[2];
        Book[]book = new Book[3];

        person[0] = new Person("Lais", "F", 17);
        person[1] = new Person("Bruno", "M", 17);

        book[0] = new Book("Verity", "Colleen Hoover", 320, person[0]);
        book[1] = new Book("Diary of Anne Frank", "Anne Frank", 283, person[1]);
        book[2] = new Book("The Misteries of the Universe", "Manual do Mundo", 224, person[0]);
    
        book[0].open();
        book[0].flipToPage(319);
        book[0].nextPage();
        book[0].nextPage();
        
        book[0].previousPage();
        book[0].close();
        System.out.println(book[0].details());
    }
}
