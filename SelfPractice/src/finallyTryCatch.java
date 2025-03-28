public class finallyTryCatch {
    public static void main(String[] args) {
        try{
            int a=98/0;
            System.out.println("You are in Try Block.");
            System.out.println(a);
        }catch(ArithmeticException e){
            System.out.println("Exception Caught ::::");
        }finally {
            System.out.println("Always Excecuted");
        }
        System.out.println("Rest Code");
    }
}
