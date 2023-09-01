import java.io.*;
import java.util.*;
class Main{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
    try{
    File f=new File("new.txt");
    boolean x=f.createNewFile();
      if(x){
        System.out.println("New file created.");
      }
      else{
        System.out.println("File already exists.");
      }
      System.out.println("Enter the contents to add in file: ");
      String s=sc.nextLine();
      FileWriter w=new FileWriter("new.txt");
      w.write(s);
      System.out.println("Data has been succesfully written to file");
      w.close();
      int a;
      System.out.println("Enter 1 to display the contents in file.");
      a=sc.nextInt();
      if(a==1){
        char[] ch=new char[100];
        FileReader r=new FileReader("new.txt");
        r.read(ch);
        System.out.println(ch);
        r.close();
      }
    }
    catch(Exception e)
      {
        System.out.println(e);
      }
  }
}
