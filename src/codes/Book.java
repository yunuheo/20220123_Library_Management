package codes;

public class Book {
	
	String title;
	int rentFee;
	int ageLimit;
	User rentUser;
	
	 void showBookInfo() {
		System.out.println("===== 도서 정보 출력 =====");
		System.out.println("제목 : "+title);
		System.out.println("대여료 : "+rentFee + "원");
		
//		연령제한이 0이면, 전체 이용가. 그 외에는 ?세 이용가
		if (ageLimit==0) {
			System.out.println("전체 이용가");
		}
		else {
			System.out.println(ageLimit+"세 이용가");
		}
	}

}
