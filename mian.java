

import java.util.ArrayList;

    class Book{
        public String name,author;
        Book(String name,String author)
        {
            this.name=name;
            this.author=author;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    '}';
        }
    }
    class library{
        public ArrayList<Book> books;
        library(ArrayList<Book> books)
        {
            this.books=books;
        }
        public  void addBook(Book b)
        {
            System.out.println("the books had been added to the library of author ");
            this.books.add(b);
        }
        public void issuedBook(Book b,String books_issued_to)
        {
            System.out.println("the book had been issued from the library to " + books_issued_to);
            this.books.remove(b);
        }
        public void returnBook(Book b)
        {
            System.out.println("this book had been returned " + b);
            this.books.add(b);
        }


    }
    public class mian {
        public static void main(String[] args) {
            ArrayList<Book> bk=new ArrayList<>();
            Book b1=new Book("the great gatsby","F.Scott Fitzgerld");
            bk.add(b1);
            Book b2=new Book("Nineteen Eighty-Four","George Orwell");
            bk.add(b2);
            Book b3=new Book("Jane Eye","Charlotte Brontte");
            bk.add(b3);
            Book b4=new Book("The Last Lyef","Ruskin Bond");
            bk.add(b4);
            Book b5=new Book("Gitanjali","Rabindranath tagore");
            library l1=new library(bk);
            System.out.println(l1.books);


        }
    }


