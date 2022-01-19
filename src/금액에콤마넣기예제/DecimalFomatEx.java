package 금액에콤마넣기예제;

import java.util.Scanner;

public class DecimalFomatEx {

	public static void main(String[] args) {
		String amount;
		
		System.out.println("결제 금액을 입력>>>");
		Scanner scan = new Scanner(System.in);
		long totalAmount = scan.nextLong();		// "563000" => 563000 변환

		amount = Utils.toNumberFormat(totalAmount);	  //"563,000"
		System.out.println("총결제 금액 : " + amount + "원");
	}

}
