public class Bird extends Animal {
    double wingSpan;

    public Bird(String name,int age,double wingSpan){
        super(name, age);
        this.wingSpan=wingSpan;
    }
    @Override public void makeSound(){
        System.out.println("chirp");
    }
    @Override public String toString(){
        return super.toString() + " wingSpan: "+ wingSpan;
     }
}
