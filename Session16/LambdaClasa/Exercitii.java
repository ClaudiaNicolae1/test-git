package Session16.LambdaClasa;
public class Exercitii {
    public void main(String[] args) {
        Book lambdaBook = new Book("Author 1", "name1", 18) {
            @Override
            public void readBook() {
                System.out.println("reading book");
            }
            //single iteration (O folosesti doar o data)
        };
        lambdaBook.readBook();
        Drawable drawable = () -> System.out.println("drawing a circle");
        //wow :O
        drawable.draw();
    }
}

    class Book{
        private String name;
        private String author;
        private float price;

        public Book(String name, String author, float price) {
            this.name = name;
            this.author = author;
            this.price = price;
        }

        public void readBook(){
            System.out.println("Reading book with name " + name + "by author");
        }
    }
    class CustomBook extends Book{
        private String genre;

        public CustomBook(String name, String author, float price) {
            super(name, author, price);
        }

    }

interface Drawable{
    void draw();
}