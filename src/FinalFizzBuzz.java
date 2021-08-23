public class FinalFizzBuzz {
    public static void main(String[] args) {
        work(4000, new int[]{3,5,9}, new String[]{"Fizz", "Buzz","Tizz"});
    }

    /**
     * this is going to do the work for the fizzBuzz.
     * @param limit this is how many numbers you want the system to use.
     * @param nums this is the numbers you want the system to check for. The numbers should match
     *             with the index in values you want to display.
     * @param values this is the strings you want to print when each of the numbers
     *               hit. They should be the same index you as the number in num you want them to match
     *               with.
     */
   public static void work(int limit, int[] nums, String[] values){
       StringBuilder sb = new StringBuilder();
        if (nums.length != values.length){
            System.out.println("Number value mismatch. Please make sure the number checked for is the" +
                    " same length values desired.  ");
        }
        else{
            for(int i = 0; i < limit; i++){
                sb.delete(0, sb.length());
                for(int j = 0; j<nums.length; j++){
                    if( i % nums[j] == 0){
                        sb.append(values[j]);
                    }
                }
                if (sb.toString() == ""){
                    sb.append(i);
                }
                System.out.println(sb.toString());
            }
        }

   }
}



