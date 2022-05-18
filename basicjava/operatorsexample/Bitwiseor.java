class Bitwiseor{

public static void main(String []args){

int a=10;
int b=5;

System.out.println((++a>b++)|(a!=b)); //true
System.out.println((++a<b++)|(++a>b)); //true
System.out.println(a); //13
System.out.println(b); //7

}
}