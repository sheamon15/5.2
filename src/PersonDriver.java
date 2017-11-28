import java.util.Scanner;
public class PersonDriver {
    public static void main (String [] args){
        Person Shea = new Person();
        System.out.println(Shea.toString());

        Person Nick = new Person("Nick",22);

        if (Shea.getName().equals(Nick.getName())&& Shea.getAge()==Nick.getAge()) {
            System.out.println("Two persons name and age are equal");
        }else {
            System.out.println("Two persons names and age are not equal");
        }

        if (Shea.getName().equals(Nick.getName())) {
            System.out.println("Two person names are the same");
        }else {
            System.out.println("Two persons names are not the same");
        }

        if(Shea.getAge()<=Nick.getAge()) {
            System.out.println("Nick is older");
        }else {
            System.out.println("Shea is older");
        }
        if(Shea.getAge()>= Nick.getAge()) {
            System.out.println("Nick is younger");
        }else{
            System.out.println("Shea is younger");


        }

    }
}
