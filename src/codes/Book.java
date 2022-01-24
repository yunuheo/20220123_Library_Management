package codes;

public class Book {
	
	String title;
	int rentFee;
	int ageLimit;
	
//	책을 빌려간 사람은? => 없다고 표현.
	User rentUser = null;
	
//	책정보 입력받는 생성자.
	 public Book(String title, int rentFee, int ageLimit) {
		super();
		this.title = title;
		this.rentFee = rentFee;
		this.ageLimit = ageLimit;
	}

	void showBookInfo() {
		System.out.println("===== 도서 정보 출력 =====");
		System.out.println("제목 : "+this.title);
		System.out.println("대여료 : "+this.rentFee + "원");
		
//		연령제한이 0이면, 전체 이용가. 그 외에는 ?세 이용가
		if (ageLimit==0) {
			System.out.println("전체 이용가");
		}
		else {
			System.out.println(this.ageLimit+"세 이용가");
		}
		
//		빌려간 사람이 있는가? 있다면 그사람의 이름 표시. 없다면 "대여가능" 표시.
		if (rentUser!=null) {
			System.out.println("빌려간 사람 : "+rentUser.name);
		}
		else {
			System.out.println("빌려간 사람 : 없음(대여가능)");
		}
		
	}

}
