public class Ex1 {
    public static void main(String[] args) {

        for (int i=1; i<101 ;i++){
            System.out.println(i);
            if ( i % 3 == 0 ){
                System.out.println("hello");
            } else if ( i % 5 == 0 ) {
                System.out.println("world");
            } else if ( i % 7 == 0) {
                System.out.println("yoo");
            }
        }
    }
}
