package activities_session_2;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title="Life story of a Middle class man";
		Book newNovel=new MyBook();
		newNovel.setTitle(title);
		System.out.println("Title of the book is " + title);
		System.out.println("Title of the book is " + newNovel.getTitle());
		
	}

}
