// import java.util.*;
// public class ExceptionHandling {
//     public static void main(String args[]){
        
//         System.out.println();
//         multicatch();

//     }
    

//     // public static int divideLBYL(){
//     //    Scanner sc= new Scanner(System.in);
//     //    int a= sc.nextInt();
//     //    int b= sc.nextInt();


//     //     if(b!=0){
//     //         return a/b;
//     //     }else{
//     //         return 0;
//     //     }
//     //     // try{
//     //     //     return a/b;
//     //     // }catch(ArithmeticException e){
//     //     //     return 0;
//     //     // }

//     // }

//     public static int getvalEAFP(){
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter a number");
      
//         // boolean val=true;
//         // for(int i=0;i<a.length();i++){
//         //     if(!Character.isDigit(a.charAt(i))){
//         //         val= false;
//         //         break;
//         //     }
           
//         // }

//         //     if(val){
//         //         return  Integer.parseInt(a);
//         //     }else{
//         //         return 0;
//         //     }

//         try{
//             return  sc.nextInt();
//         }catch(InputMismatchException e){
//             return 0;
//         }
        
        

//     }



//     public static void multicatch(){
//         int a=1;
//         int b=42;
//         try{
//              b=42/0;
//         }
//         catch (ArithmeticException e){
//             System.out.println("Arithmatic exception reached");
//         }
//         catch(Exception e){
//             System.out.println("generic exception ");
//         }
//     }
// }
