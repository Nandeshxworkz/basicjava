class Flower{
String name;
String colour;
int noofpetals;

void shedfragrance(){
System.out.println(colour + " " + name + " " + " is shedding fragrance " + "and no of petals is 8");
}
void bloom(){
System.out.println(colour + " " + name + " " + " is blooming " + "and no of petals is 8");
}	
}

class Flowerdemo{
	
	public static void main(String args[]){
		
		Flower rose = new Flower();
		
		rose.name = "Rose";
		rose.colour = "Red";
		rose.noofpetals = 8;
		
		rose.bloom();
		rose.shedfragrance();
	}
}
