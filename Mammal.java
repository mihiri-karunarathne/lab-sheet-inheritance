public class Mammal extends Animal {
    String furColor;

    public Mammal(String name,int age,String furColor){
    super(name, age);
    this.furColor=furColor;
}
@Override 
public void makeSound(){
  System.out.println("meow");
}
@Override 
public String toString(){
    return super.toString() + " furColor: "+ furColor;
 }
}