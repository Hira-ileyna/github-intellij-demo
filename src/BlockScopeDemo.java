public class BlockScopeDemo {
    public static void main(String[] args) {
        int outerX = 5;
        if(true){
            int innerY = 15;

            System.out.println(outerX);
            System.out.println(innerY);
        }

        System.out.println(outerX);
       // System.out.println(innerY);


    }
}
