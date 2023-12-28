import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Human{
    String name;
    String lastname;
    String year;
    String address;

    public Human(String a_name, String a_lastname, String a_year, String a_address){
        this.name = a_name;
        this.lastname = a_lastname;
        this.year = a_year;
        this.address = a_address;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {

        Human[] arrIn = new Human[5];
        Human[] arrOut = new Human [5];

        arrIn[0] = new Human("Olivia", "Smith", "1999", "123 Oak Street");
        arrIn[1] = new Human("Ethan", "Johnson", "2004", "789 Maple Avenue");
        arrIn[2] = new Human("Emma", "Brown", "1987", "456 Pine Road");
        arrIn[3] = new Human("Noah", "Davis", "1995", "101 Cedar Lane");
        arrIn[4] = new Human("Ava", "Wilson", "1987", "222 Elm Street");

        File file = new File("note.txt");
        PrintWriter pw = new PrintWriter(file);

        for (int i=0; i<5; i++) {
            pw.println(arrIn[i].name + "   " + arrIn[i].lastname + "   " + arrIn[i].year + "   " + arrIn[i].address);
        }
        System.out.println("The file has been written");
        pw.close();

        File file1 = new File("exam.txt");
        Scanner reader = new Scanner(file1);

        int i = 0;
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            String[] part = line.split(" ");
            String str = part[3] + " " + part[4] + " " + part[5];
            arrOut[i] = new Human(part[0], part[1], part[2], str);
            System.out.println(arrOut[i].name + "   " + arrOut[i].lastname + "   " + arrOut[i].year + "   " + arrOut[i].address);
            i++;
        }
        reader.close();
    }
}