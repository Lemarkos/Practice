public class EvenArray {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        int[] numbers1 = {};
        int[] numbers2 = {};

//        int zamena = 0;
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random()*50);
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
//        for (int i = 0; i < numbers.length; i++){
//            if (numbers[i]%2==0){
//                numbers[i] = zamena;
//            }
//            System.out.print(numbers[i] + " ");
//        }
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2==0){
                numbers1[i] = numbers[i];
                System.out.println(numbers1[i]);
            }
            if (numbers[i]%2!=0){
                numbers2[i] = numbers[i];
            }
        }
//        for (int num : numbers1){
//            System.out.println(num +" ");
//        }
    }
}
