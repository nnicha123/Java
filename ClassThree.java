public class ClassThree {
  public static void main(String[] z){
    Book a = new Book("11111-11111","Astronomy");
    Book b = new Book("22222-22222","Biology");
    Book c = new Book("11121-11111","Astronomer");
    if(a.isEqual(c)){
      System.out.println("Same bar code");
    } else {
      System.out.println("Different bar code");
    }
  }
}
class Book{
  String barCode,title;
  Book(String barCode, String title){
    this.barCode = barCode;
    this.title = title;
  }
  boolean isEqual(Book book){
    return book.barCode == barCode;
  }
}
