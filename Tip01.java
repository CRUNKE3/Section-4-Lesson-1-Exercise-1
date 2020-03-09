
package tip01;

public class Tip01 {
    
    public static void main(String[] args) {
        //Find everyone's indivudlal total after tax(5%) and tip(15%)
        double tax = 0.05;
        double tip = 0.15;
        double person1 = 10;
        double person2 = 12;
        double person3 = 9;
        double person4 = 8;
        double person5 = 7;
        double person6 = 15;
        double person7 = 11;
        double person8 = 30;
        double netPerson1 = person1*(1+tax+tip);
        double netPerson2 = person2*(1+tax+tip);
        double netPerson3 = person3*(1+tax+tip);
        double netPerson4 = person4*(1+tax+tip);
        double netPerson5 = person5*(1+tax+tip);
        double netPerson6 = person6*(1+tax+tip);
        double netPerson7 = person7*(1+tax+tip);
        double netPerson8 = person8*(1+tax+tip);
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        System.out.println("person1: $" + netPerson1);
        System.out.println("person1: $" + netPerson2);
        System.out.println("person1: $" + netPerson3);
        System.out.println("person1: $" + netPerson4);
        System.out.println("person1: $" + netPerson5);
        System.out.println("person1: $" + netPerson6);
        System.out.println("person1: $" + netPerson7);
        System.out.println("person1: $" + netPerson8);
    }    
}
