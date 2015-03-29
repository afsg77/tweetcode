// Factorial
class A{public static void main(String[] a){System.out.println(A.f(Long.valueOf(a[0])));}static long f(long n){return n==1 ? n : n*f(n-1);}}