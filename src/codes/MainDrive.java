package codes;

public class MainDrive {

	public static void main(String[] args) {
		
		Book book1 = new Book("해리포터",2500,0);
		Book book2 = new Book("타짜", 3500, 19);
		Book book3 = new Book("삼국지", 6500, 12);
		
		User user1 = new User("김아동", 2012, 3500);
		User user2 = new User("박학생", 2005, 5000);
		User user3 = new User("이어른", 1990, 10000);
		
//		도서관 이용자들이 각각 서로다른 책을 빌린 상황.	
		
		user1.rentBook(book2); // 김아동은 연령제한에 의해 대여불가
		user2.rentBook(book3); // 박학생은 보유금액이 부족하므로 대여불가
		
		user3.rentBook(book2); // 이어른은 book2를 대여가능 -> 보유금액차감
		user3.rentBook(book3); // 이어른은 book3을 대여가능 -> 보유금액 차감
		user3.rentBook(book1); // 이어른은 보유금액o, 연령제한o but 보유금액을 모두 사용하여 대여불가.
		
		book1.showBookInfo();
		book2.showBookInfo();
		book3.showBookInfo();
		
		user3.showUserInfo();
		
		
	}

}
