package Notes2;

public class Character{

    String name, dialog;
    int hp,mp,lvl;

    Character(String name, String dialog, int hp, int mp, int lvl){
        this.name=name;
        this.dialog=dialog;
        this.hp=hp;
        this.mp=mp;
        this.lvl=lvl;
    }

    //methods will only execute when called in main
 void sayDialog(){
     System.out.println(name + ": " + dialog);
 }
 void talkToCharacter(Character c){
     System.out.println(dialog +"," + c.name);
 }

}