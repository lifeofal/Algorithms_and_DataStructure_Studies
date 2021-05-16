public class BigO {

    public static void bigO_n_Squared(int[] array){
        //print the combinations of all indexes of size 2
        int count = 0;
        for(int i = 0; i < array.length; i++){
            for(int y = i+1; y< array.length; y++){
                System.out.println("["+array[i] + "," + array[y]+"]");
                count++;
            }
        }
        System.out.println(count +" Total combinations");
    }


    public static void main(String[] args) {
        int [] array = {0,1,2,3,4,5,6,7,8,9};
        bigO_n_Squared(array);
    }
}
