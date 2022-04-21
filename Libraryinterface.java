interface LibraryUser{
	void registerAccount();
	void requestBook();
}
class KidUser implements LibraryUser{
	int age;
	String bookType;
	KidUser(int age,String bookType){
		this.age=age;
		this.bookType=bookType;
	}
	public void registerAccount() {
		if(age<12) {
			System.out.println("you have successfully registered under Kids Account");
		}
		else {
			System.out.println("Sorry,Age must be less than 12 to registered as a kid");
		}
	}
	public void requestBook() {
		if(bookType=="Kids") {
			System.out.println("Book issued successfully, please retrurn the book within 10 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
}
class AdultUser implements LibraryUser{
	int age;
	String bookType;
	AdultUser(int age,String bookType){
		this.age=age;
		this.bookType=bookType;
	}
	public void registerAccount() {
		if(age>12) {
			System.out.println("you have successfully registered under Adult Account");
		}
		else {
			System.out.println("Sorry,Age must be greater than 12 to registered as a Adult");
		}
	}
	public void requestBook() {
		if(bookType=="Fiction") {
			System.out.println("Book issued successfully, please retrurn the book within 7 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}
}
public class Libraryinterface {
	public static void main(String Agrs[]) {
		KidUser K1=new KidUser(10,"Kids");
		K1.registerAccount();
		K1.requestBook();
		KidUser K2=new KidUser(18,"Fiction");
		K2.registerAccount();
		K2.requestBook();
		AdultUser A1=new AdultUser(5,"Kids");
		A1.registerAccount();
		A1.requestBook();
		AdultUser A2=new AdultUser(23,"Fiction");
		A2.registerAccount();
		A2.requestBook();
	}
}
