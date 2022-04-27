package problem2;

public class AppTest {
	public static void main(String[] args) {
        Author Aauthor1=new Author("Koustubh","koustubh@gmail.com",'M');
        Books Book1= new Books("Mahabharat", Aauthor1,2000);
        System.out.println(Book1);
}
}
