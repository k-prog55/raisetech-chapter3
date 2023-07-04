public class Main {
    public static void main(String[] args) {
        String[] names = {"新潟県", "滋賀県", "京都府"};
        int index = 5;
        try{
            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("配列の範囲を超えています");
        }
    }
}