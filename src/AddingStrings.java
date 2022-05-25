
public class AddingStrings {
	
	String name1 ;
	String name2 ;
	
	AddingStrings(String name1, String name2){
		this.name1 = name1;
		this.name2 = name2;
	}
	
	void display() {
		System.out.println(name1 + " " + name2);
	}
	
	public static void main(String[] args) {
		AddingStrings ad = new AddingStrings("Java", "Program"); 
		ad.display();
		//System.out.println(ad.name1 + "" + ad.name2);
		
		}
}
