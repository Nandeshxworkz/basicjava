class Logicalor{

public static void main(String []args){

int p=50;
int q=100;

System.out.println((p==q)||(p<q)); //true
System.out.println((p!=q)||(p>q)); //true

System.out.println("_________________________");



int a=2;
int b=3;


System.out.println((a>b) || (a!=b++)); //true  b(4)
System.out.println((++a>b)||(b>a++)); //true a(4)
System.out.println(a); //4
System.out.println(b); //4
System.out.println((++a==b--)||(++a>--b)); //true
System.out.println(a); //6
System.out.println(b); //2

}

}