package buyseller;

import java.util.Scanner;

public class Buyer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 물건 대금 입력 받기
        System.out.print("물품 대금을 입력하세요: ");
        int amount = sc.nextInt();
        
        // 카드 번호 입력 받기
        System.out.print("카드 번호를 입력하세요: ");
        String cardNumber = sc.next();
        
        // 유효 기간 입력 받기
        System.out.print("유효 기간을 입력하세요 (MM/YY): ");
        String expireDate = sc.next();
        
        // CVV 번호 입력 받기
        System.out.print("CVV 번호를 입력하세요: ");
        int cvvNumber = sc.nextInt();
        
        // 결제 요청
        boolean isPaymentSuccessful = makePayment(amount, cardNumber, expireDate, cvvNumber);
        
        // 결제 결과 출력
        if (isPaymentSuccessful) {
            System.out.println("결제가 완료되었습니다.");
        } else {
            System.out.println("결제에 실패하였습니다.");
        }
        sc.close();
    }
    
    // 신용카드 결제 함수
    public static boolean makePayment(int amount, String cardNumber, String expireDate, int cvvNumber) {
        // 카드 결제 로직 구현
        // ...
        
        // 결제 성공 여부 반환
        return true;
    }
   
}