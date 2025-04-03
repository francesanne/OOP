package Notes2;

public class Main{
    public static void main(String[] args) {

    Character ch = new Character("France", "Hello there", 100, 50, 5);
    Character c1 = new Character("Anne", "Hi there", 75, 90, 3);


    ch.sayDialog();
    c1.sayDialog();
    ch.talkToCharacter(c1);
    c1.talkToCharacter(ch);




    }
}