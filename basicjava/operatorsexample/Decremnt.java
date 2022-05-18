class Decremnt{

public static void main(String args[]){

int a = 10;
int b = 20;
int c = 30;

c=a;
--a;

System.out.println(c++); //10
System.out.println(a++); //
System.out.println(b--);
System.out.println((--b) + (--c));
System.out.println(a);
System.out.println(b);
System.out.println(c);

}

}