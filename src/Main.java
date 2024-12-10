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


    }
}