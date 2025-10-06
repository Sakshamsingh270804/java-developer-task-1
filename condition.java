public class condition {
    public static void main(String [] args){
        int age=17;
        if (age>=18) {
            System.out.println("adult: drive, vote");
        }
        if (age>13 && age<18){
            System.out.println("teenagers");
        }
        else {
            System.out.println("not adult");
        }
    }
}
