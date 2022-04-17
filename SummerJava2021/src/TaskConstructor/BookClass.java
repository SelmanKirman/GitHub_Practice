package TaskConstructor;

public class BookClass {
	/*
     * Write program as a Book class that will have 2 Constructors. While creating
     * an object make sure: Instance variables are being initialized Both
     * Constructors are being executed
     * 
     * 
     * Programi 2 Constructor a sahip olacak bir Kitap sinifi olarak yazin
     * iki obj üzerinden display metodu ile kitaplari yazdiriniz
     */
    String title, author;
    int publish;
    static int pages;
	
    public BookClass(String title, String author, int publish) {
		super();
		this.title = title;
		this.author = author;
		this.publish = publish;
	}
    
    public static void main(String[] args) {
    	BookClass kitap1=new BookClass("suc ve ceza","dostoyevski",1234);
    	BookClass kitap2=new BookClass("calikusu","resat nuri",2345);
    	
    	kitap1.disPlay();
    	kitap2.disPlay();
		
	}

	private void disPlay() {
		System.out.println("kitabiniz : " + title + "yazariniz : " + author + " yayim yili : " +publish);
		
	}

}
