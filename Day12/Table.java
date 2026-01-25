package Day12;

public class Table {
    
    public static void main(String[] args) {
        for(int num =11; num<=20;num++){
         for (int i = 1; i <= 10; i++) {
            int tmp = num * i;
            System.out.println(num + " *  " + i + " : " + tmp);

        }
        System.out.println("--------------------");
    }
    }
}
