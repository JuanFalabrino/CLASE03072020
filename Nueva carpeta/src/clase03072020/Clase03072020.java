
package clase03072020;


public class Clase03072020 {

  
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        int sum = 0;
        
        
        //for (int i=0; i<nums.length;i++){
        //sum= sum + nums[i];
        //}
        
        for (int x : nums){
          sum= sum + x;
         }
          
        
        System.out.println("El total es : " + sum);
        
        
        
        
        
    }
    
}
