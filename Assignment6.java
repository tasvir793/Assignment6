Que:1 Create an interface and its methods?
Ans:1

package animals;
public interface Animals {

    
     
       public void speak();
       public void eat();
    }

package animals;
public class Cat implements Animals{
      public void speak(){
        System.out.println("i am a cat");
    }
    public void eat(){
        System.out.println("i eat chapati");
    }
    public static void main(String args[]){
        Cat cat=new Cat();
        cat.speak();
        cat.eat();
    }
    
}

package animals;
public class Dog implements Animals {
    public void speak(){
        System.out.println("i am a dog");
    }
    public void eat(){
        System.out.println("i eat meat");
    }
    public static void main(String args[]){
        Dog dog=new Dog();
        dog.speak();
        dog.eat();
    }
    
}

Que:3Convert string into Integer?
Ans:3
package temp;
public class Temp {

    
        int a;
        int b;
        public static void main(String args[]){
            Qu1
            int a=Integer.parseInt(args[0]); 
            int b=Integer.parseInt(args[1]);
            System.out.println("sum is = "+(a+b));
        }
    }
    

    
    
    

