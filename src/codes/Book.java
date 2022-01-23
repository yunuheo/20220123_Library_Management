package codes;

public class Book {
	
	String title;
	int rentFee;
	int ageLimit;
	
//	책을 빌려간 사람은? => 없다고 표현.
	User rentUser = null;
	
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
		
		if (rentUser!=null) {
			System.out.println("빌려간 사람 : "+rentUser.name);
		}
		else {
			System.out.println("빌려간 사람 : 없음");
		}
		
	}

}
