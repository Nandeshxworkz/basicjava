class AssignAirthmatic{

public static void main(String []args){

int a=4;
int b=a;

System.out.println(a+=b);
System.out.println(a-=b);
System.out.println(a*=b);
System.out.println(a/=b);
System.out.println(a%=b);

System.out.println("________________");
int m=10;
int n=m;

System.out.println(n+=m); 
System.out.println(n-=(m++)); 
System.out.println(n*=(m++)); 
System.out.println(n/=(++m));
System.out.println(n%=(++m));


}
}