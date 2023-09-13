public class Animal{
    String name;
    int age;

    Animal(String name,int age){
      this.name=name;
      this.age=age;
    }
  
    public void makeSound(){
        System.out.println("sound");
    }
    public String toString(){
       return "name:" +name + " age: "+ age;
    }  
}