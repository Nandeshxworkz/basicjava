class BitwiseAnd{

public static void main(String []args){

int p=2;
int q=4;

System.out.println((p>q) & (++p!=q));
System.out.println(p);
System.out.println(q);


System.out.println("---------------------");



System.out.println((p>q++) & (++p>q++)); // false
System.out.println((++p<q++) & (++p!=q++)); //true
System.out.println(p); //6
System.out.println(q); //8


}
}