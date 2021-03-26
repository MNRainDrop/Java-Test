public class Tester {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        for (int i = 0; i < 5; i++){
            String s = "";
            for (int j = 5; j > i; j--){
                s += "* ";
            }
            System.out.println(s);
        }

        for (int i = 0; i < 5; i++){
            String s = "";
            for (int j = 0; j <= i; j++){
                s += "* ";
            }
            System.out.println(s);
        }
    }
}