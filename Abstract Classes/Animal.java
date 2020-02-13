package Uno;

// IF THERE IS A MIXTURE of Unique and generalized methods that your subclasses
//will inherit then you should use an Abstract class as the super class


    //Abstract class
  public abstract class Animal {
  
	 // Abstract method (does not have a body)
      public abstract void animalSound();
   
     // A Regular method
      public void sleep() {
    System.out.println("the animal is sleeping");
   }
 }