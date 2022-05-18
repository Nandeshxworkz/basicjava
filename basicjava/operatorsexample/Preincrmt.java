class Preincrmt{
public static void main(String []args){
int a=10;
int b=++a;

System.out.println("a:"+ a);
System.out.println("b:"+ b);
System.out.println("a:"+ ++a);
System.out.println("b:"+ ++a);
System.out.println("b:"+ a++);

int n=500;
int m=600;

System.out.println(n++); // 500
System.out.println(++m); //601
System.out.println(++m); // 602
System.out.println(++n); //502
System.out.println(n); //502
System.out.println(m); //602
System.out.println(n++); //502
System.out.println(m++); //602

}
}