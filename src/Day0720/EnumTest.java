package Day0720;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(Week.valueOf("THURSDAY").equals("Week.SUNDAY") || Week.valueOf("THURSDAY").equals(Week.SATURDAY))
			System.out.println("오늘이 주말입니다");
		else
			System.out.println("오늘이 평일입니다");
		
		
		Week[] days = Week.values();
		
		for(Week day : days)
			System.out.print(day + " ");
	}

}
