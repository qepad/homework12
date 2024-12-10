public class Main {
    public static void main(String[] args) {

        Author king = new Author("Steven", "King");
        Author rowling = new Author("Joanne", "Rowling");

        Book it = new Book("It", king, 1986);
        Book harryPotter = new Book("Harry Potter", rowling, 1997);

        System.out.println("Книга " + it.getTitle() + ", автор " + it.getAuthor().getFirstName() + " " + it.getAuthor().getLastName() + ", год публикации - " + it.getYear());
        System.out.println("Книга " + harryPotter.getTitle() + ", автор " + harryPotter.getAuthor().getFirstName() + " " + harryPotter.getAuthor().getLastName() +", год публикации - " + harryPotter.getYear());

        harryPotter.setYear(2000);
        System.out.println(harryPotter.getTitle() + ", новый год публикации - " + harryPotter.getYear());


        // тут новая домашка

        System.out.println();
        System.out.println("ДЗ №13");
        System.out.println(it);
        System.out.println(harryPotter);
        System.out.println("результат сравнения книг " + harryPotter.getTitle() + " и " + it.getTitle() + ": " + harryPotter.equals(it));
        System.out.println("хеш код для It: " + it.hashCode());
        System.out.println("хеш код для Harry Potter: " + harryPotter.hashCode());


    }
}