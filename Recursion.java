

// print x^n (stack height = n)
public class Recursion {
    public static int calcPower(int x, int n){
       if(n == 0){
        return 1;
       }
       if(x == 0){
        return 0;
       }
       int xPownm1 = calcPower(x, n-1); //kaam
       int xPown = x * xPownm1;
       return xPown;
    }

    public static void main(String args[]){
       int x = 2, n = 5;
       int ans = calcPower(x,n);
       System.out.println(ans);
    }
}
// // print the fibonacci sequence till the nth term

// public class Recursion {
//     public static void printFib(int a, int b, int n){
//        if(n == 0){
//         return;
//        }
//         int c = a + b;
//         System.out.println(c);
//         printFib(b,c,n-1);
//     }
//     public static void main(String args[]){
//         int n = 7;
//         int a = 0, b = 1;
//         System.out.println(a);        
//         System.out.println(b);        
//         printFib(a, b, n-2);
//     }
// }

//print factorial of a number n

// public class Recursion {
//     public static int calcfactorial(int n){
//         if(n == 1 || n == 0){
//             return 1;
    
//         }

//       int fact_nm1 = calcfactorial(n-1);
//       int fact_n = n * fact_nm1;
//       return fact_n;
//     }
//     public static void main(String args[]){
//         int n = 5;
//         int ans = calcfactorial(n);
//         System.out.println(ans);
//     }
// }

//print sum of first natural numbers

// public class Recursion {
//     public static void printSum(int i,int n,int sum){
//         if(i == n){
//             sum += i;
//             System.out.println(sum);
//             return;
//         }

//         sum += i;
//         printSum(i+1,n,sum);
//         System.out.println(i);
//     }
//     public static void main(String args[]){
//         printSum(1,5,0);
//     }
// }
// //print nos from 1 to 5

// public class Recursion {
//     public static void printNumb(int n){
//         if(n == 6){
//             return;
//         }

//         System.out.println(n);
//         printNumb(n+1);
//     }
//     public static void main(String args[]){
//         int n = 1;
//         printNumb(n);
//     }
// }

//print no from 5 to 1.

// public class Recursion {
//     public static void printNumb(int n){
//         if(n == 0){
//             return;
//         }

//         System.out.println(n);
//         printNumb(n-1);
//     }
//     public static void main(String args[]){
//         int n = 5;
//         printNumb(n);
//     }
// }
