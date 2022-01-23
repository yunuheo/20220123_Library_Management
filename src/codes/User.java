package codes;

public class User {
	
	String name;
	int birthYear;
	int userMoney;
	
	public User(String name, int birthYear, int userMoney) {
		super();
		this.name = name;
		this.birthYear = birthYear;
		this.userMoney = userMoney;
	}

	
	
	int getAge(int birthYear) {
		int age = 2022 - birthYear +1;
		return age;
	}
	
	void showUserInfo() {
		System.out.println("===== 사용자 정보 출력 =====");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+getAge(2022)+"세");
		System.out.println("보유 금액 : "+ userMoney+"원 보유");
	}
	
//	사용자가 책을 빌려가는 기능.
	boolean rentBook(Book rentBook) {
		
//		빌려준다.=> 빌려가는 책의, 빌려간 사람으로 나를 등록.
		rentBook.rentUser = this;
		return true;
	}
	
	
	

}
