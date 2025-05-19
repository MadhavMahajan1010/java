public class test {

    public static void main(String[] args) {
        // System.out.println("Hello World");
        int a = 1;
        System.out.println(Integer.toString((a)));
        String name = new String("madhav");
        System.out.println(name);
        for(int i=1;i<=10;i++){
            System.out.print(i);
        }
        // int i=1;
        // while(i<=10){
        //     System.out.println((i));
        //     i++;
        // }
        System.out.println();
        System.out.println();

        for(int i=0;i<5;i++){
            // System.out.println(i);
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();
        int rows=3;
        int stars=1;
        // System.out.println(stars);
        int num=2;
        for(int i=0;i<rows;i++){

            for(int j=0;j<num;j++){
                System.out.print(" ");
            }
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            for (int j = 0; j < num; j++) {
                System.out.print(" ");
            }
            num--;
            stars=stars+2;
            System.out.println();
        }


    }
    // public static void main1(String[] args){
    // System.out.println("Hello World 1");
    // }
    // public static void main2(String[] args){
    // System.out.println("Hello World 2");
    // }

}