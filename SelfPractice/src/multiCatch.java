public class multiCatch {
    public static void main(String[] args) {
        try{
            int arr[] = new int[5];
            int a = 0/0;
            arr[10] = 50;
//this will show Division Error because 0/0 is written above the arr[10]=50;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBound");
        }catch(ArithmeticException e){
            System.out.println("Division Error 0/0");
        }catch(Exception e){
            System.out.println("Some Other Exception");
        }
    }
}
