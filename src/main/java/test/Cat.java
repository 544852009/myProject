package test;

public class Cat  {

    Talk talk;


    public Cat() {
        talk = new Talk() {
            @Override
            public void talk() {
                System.out.println("talk");
            }
        };
    }

    public void catTalk(){
        talk.talk();
    }
}

class Test{
    public static void main(String[] args) {
        Cat cat  = new Cat();
        cat.catTalk();
    }
}

