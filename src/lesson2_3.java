public class lesson2_3 {
    public static void main(String[] args) {
        System.out.println("ようこそ占いの館へ");
        System.out.println("あなたの名前を入力してください");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);
        System.out.println("占いの結果が出ました！");
        System.out.println( age + "歳の" + name + "さん");
        int fortune = new java.util.Random().nextInt(4) + 1;
        switch (fortune) {
            case 1:
                System.out.println("あなたの運気は大吉です！！");
                break;
            case 2:
                System.out.println("あなたの運気は中吉です！");
                break;
            case 3:
                System.out.println("あなたの運気は吉です");
                break;
            case 4:
                System.out.println("あなたの運気は凶です…");
                break;
        }
    }
}
