public class Main {
    public static void main(String[] args) {
String [] Persons = new String [11];
        int [] number= {21,23,31,433,21,44,21,2,34,424,32};
        int [] num= {3,2,78,7,5,6,80,12,61,9,23};
        Persons [0] = "Tagaibek Sayat";
        Persons [1] = "Doszhan Anuar";
        Persons [2] = "Sovetov Almas";
        Persons [3] = "Shendibay Az-Meir";
        Persons [4] = "Magauianov Arsen";
        Persons [5] = "Bortan Shakarim";
        Persons [6] = "Musin Adil";
        Persons [7] = "Azhirkhan Daulet";
        Persons [8] = "Sadenova Tabigat";
        Persons [9] = "Seit Akku";
        Persons [10] = "Erezhepov Nurbolat";
        System.out.println("This is Class");
        System.out.println("Your questions:");
        for ( int i = 0; i <=10; i++) {
            System.out.println(Persons[i]);
            System.out.println("\t" + "Question : " + number[i]+"*"+num[i] +"= What is the answer?");

        }
    }
}