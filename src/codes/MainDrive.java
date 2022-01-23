package codes;

public class MainDrive {

	public static void main(String[] args) {
		
		Book book1 = new Book("해리포터",1500,0);
		Book book2 = new Book("타짜", 2500, 19);
		Book book3 = new Book("삼국지", 2000, 12);
		
		book1.showBookInfo();
		book2.showBookInfo();
		book3.showBookInfo();
		
		User user1 = new User("김아동", 2012, 1500);
		User user2 = new User("박학생", 2005, 2500);
		User user3 = new User("이어른", 1990, 10000);
		
		user1.showUserInfo();
		user2.showUserInfo();
		user3.showUserInfo();
		

	}

}
