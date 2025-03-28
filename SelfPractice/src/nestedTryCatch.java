public class nestedTryCatch {
    public static void main(String[] args) {
        try{
            int arr[] = new int[5];//Array size=5;;0 to 4
            arr[4] = 50;{
                try{
                    int a = 0/0;
                }catch(ArithmeticException e){
                    System.out.println("Division Error");
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBound");
        }
    }
}
