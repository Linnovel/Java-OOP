public class BookDemo {
    public static void main(String [] args){
    Book gamesOfThrones = new Book("George algo",
            "Song of fire and Ice",
            "Fantasy", 180);

    Book mathBook = new Book("James Stewart",
            "Calculus", "Math", 329);

    Book javaBook = new Book("Joel Murach", "Java Programming",
            "Program", 932);

    printBookDetails(gamesOfThrones);
    printBookDetails(mathBook);
    printBookDetails(javaBook);
    }//end main

    public static void printBookDetails(Book book){
    System.out.println("titlo libro " + book.getTitle());
    System.out.println("author " + book.getAuthor());
    System.out.println("genero es de " + book.getGenre());
    System.out.println("cantidad de paginas" + book.getNumPages());

    System.out.println();
    }//end print
}//end BookDemo class
