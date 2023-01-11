package oop.etc.test;

public class TestFieldInit {
    public static void main(String[] args) {
        //필드 초기화
        Card card = new Card();
        System.out.println(card);
    }

    //필드 초기화 방법에 대한 샘플 클래스
    static class Card {
        //Field
        //명시적 초기화
        //인스턴스 변수 : 객체 안에 할당될 필드
        //힙 메모리에 객체가 new 될 때 인스턴스변수에 기록됨
        private String cardNo = "0000-000-0000001";
        private String customerName = "홍길순";
        private String cardType;
        private int useMoney = 5000000;


        //클래스 변수 : 프로그램 실행될 때 static 메모리에 자동 생성됨
        private static int cardCount = 3;   //2. 명시된 값으로 초기화됨
        private static double totalPoint;

        //초기화 블럭 :
        //선언된 필드에 초기값 대입처리하는 블럭
        {
            //필드값 = 초기값;
            cardType = "BC";
            useMoney = 10000;
        }

        static {
            //static 필드명 = 초기값;
            //초기값 처리를 위한 제어문 사용 할 수 있음 (for)
            totalPoint = 15200.5;
            cardCount  = 5;
        }

        public Card() {
            super();
            this.useMoney = 900000000;
            //(4). 생성자의 값으로 바뀜
        }

        public Card(String cardNo, String customerName) {
            super();    //생략 되어있음
            this.cardNo = cardNo;
            this.customerName = customerName;
        }

        public Card(Card ref) {
            this.cardNo = ref.cardNo;
            this.customerName = ref.customerName;
            this.cardType = ref.cardType;
        }

        @Override
        public String toString() {
            return "Card{" +
                    "cardNo='" + cardNo + '\'' +
                    ", customerName='" + customerName + '\'' +
                    ", cardType='" + cardType + '\'' +
                    ", useMoney='" + useMoney + '\'' +
                    ", totalPoint= " + totalPoint +
                    '}';
        }
    }
}
