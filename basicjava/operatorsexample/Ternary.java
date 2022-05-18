class Ternary{
public static void main(String[] args){
// ex1
int age = 25;
String result = age>=21?  "you are eligible to get marry":"you are not eligible to get marry" ;

System.out.println(result);

System.out.println("-----------------");


// ex 2
int n1=2; 
int n2=9;
int n3=-11;
int smallest=(n1>=n2)?((n1>=n3)? n1:n3) : ((n2>=n3)? n2:n3);

System.out.println(smallest);


// ex3


int mark=45;

String passing=mark>=80? "A" : mark>=60 && mark<80 ? "B":"C";


System.out.println(passing);
}
}







//Ternary.java:16: error: illegal start of expression
//}
//^
//Ternary.java:17: error: reached end of file while parsing
//}
 //^
//2 errors