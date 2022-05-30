package com.xworkz.java.Inheritance.HierarchicalInheritance.MovieInheritance;

  class Movie {
	void movietime() {
		System.out.println("We are going to watch movie");
	}
  }

   class Kgf2 extends Movie{
	   void kgf2hit(){
		   System.out.println("Kgf2 is hit blockbuster in worldwide");
	   }
    }

   class Vikrantrona extends Movie{
	   void vikrantronarelease() {
		   System.out.println("Vikrantrona will be release worldwide");
	   }
   }
   class Movieinheritance{
	   public static void main(String []args) {
		   
		   Movie m = new Movie();
		   Kgf2 k = new Kgf2();
		   Vikrantrona v = new Vikrantrona();
		   v.movietime();
		   v.vikrantronarelease();
		   k.movietime();
		   k.kgf2hit();
	   }
   }
  