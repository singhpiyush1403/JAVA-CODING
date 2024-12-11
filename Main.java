
// Maximum value

// public class Main{
//     public static void main(String args[]){
//         int [] a= {5,3,7,9,10,2,60};
//         int max= a[0];
//         for(int i=0; i<a.length; i++){
//             if(max < a[i]){
//                 max = a[i];
//             }
//         }
//         System.out.print("maximum element is : "+ max);
//     }
    
// }




// Minimum value

public class Main{
    public static void main(String args[]){
        int [] a = {5,2,5,4,7,3,6};
        int min = a[0];
        for(int i=0; i<a.length; i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        System.out.print("minimum element is:" + min);
    }
}



