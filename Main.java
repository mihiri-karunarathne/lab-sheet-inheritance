public class Main {
    public static void main(String []args){
        Animal A1=new Animal("Generic",5);
        Mammal M1=new Mammal("cat", 8,"white");
        Bird B1=new Bird("Eagle",10, 6.5);
        Dog D1 = new Dog("Labrador",3,"golden","labrador retriver");
       
       A1.makeSound();
       M1.makeSound();
       B1.makeSound();
       D1.makeSound();

       System.out.println(A1);
       System.out.println(M1);
       System.out.println(B1);
       System.out.println(D1);
       
    }
    
}
