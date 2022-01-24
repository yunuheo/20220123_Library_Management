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

	
	
	int getAge(int year) {
		int age = year - this.birthYear +1;
		return age;
	}
	
	void showUserInfo() {
		System.out.println("===== 사용자 정보 출력 =====");
		System.out.println("이름 : "+this.name);
		System.out.println("나이 : "+getAge(2022)+"세");
		System.out.println("보유 금액 : "+ this.userMoney+"원 보유");
	}
	
//	사용자가 책을 빌려가는 기능.
	boolean rentBook(Book rentBook) {
		
		if (rentBook.ageLimit > this.getAge(2022)) {
			System.out.println(this.name+"님 죄송합니다. 본 도서는"+rentBook.ageLimit+"세 이용가 입니다.");
			return false;
		}
		else if (this.userMoney < rentBook.rentFee) {
			System.out.println(this.name+"님 죄송합니다. 보유금액이 부족하여 대여하실 수 없습니다.");
			return false;
		}
		else {
//			빌려준다.=> 빌려가는 책의, 빌려간 사람으로 나를 등록.
			rentBook.rentUser = this;
			this.userMoney -= rentBook.rentFee; //유저보유금액에서 책의 대여료를 차감.
			System.out.println(this.name+"님이 "+rentBook.title+"를 대여하였습니다.");
			return true;
		}
		
		
		
	}
	
	
	

}
