package oop.etc.test;

public class TestFieldInit {
    public static void main(String[] args) {
        //�ʵ� �ʱ�ȭ
        Card card = new Card();
        System.out.println(card);
    }

    //�ʵ� �ʱ�ȭ ����� ���� ���� Ŭ����
    static class Card {
        //Field
        //����� �ʱ�ȭ
        //�ν��Ͻ� ���� : ��ü �ȿ� �Ҵ�� �ʵ�
        //�� �޸𸮿� ��ü�� new �� �� �ν��Ͻ������� ��ϵ�
        private String cardNo = "0000-000-0000001";
        private String customerName = "ȫ���";
        private String cardType;
        private int useMoney = 5000000;


        //Ŭ���� ���� : ���α׷� ����� �� static �޸𸮿� �ڵ� ������
        private static int cardCount = 3;   //2. ��õ� ������ �ʱ�ȭ��
        private static double totalPoint;

        //�ʱ�ȭ �� :
        //����� �ʵ忡 �ʱⰪ ����ó���ϴ� ��
        {
            //�ʵ尪 = �ʱⰪ;
            cardType = "BC";
            useMoney = 10000;
        }

        static {
            //static �ʵ�� = �ʱⰪ;
            //�ʱⰪ ó���� ���� ��� ��� �� �� ���� (for)
            totalPoint = 15200.5;
            cardCount  = 5;
        }

        public Card() {
            super();
            this.useMoney = 900000000;
            //(4). �������� ������ �ٲ�
        }

        public Card(String cardNo, String customerName) {
            super();    //���� �Ǿ�����
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
