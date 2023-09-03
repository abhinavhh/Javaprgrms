import java.io.*;
import java.util.*;
class File1{
  void copy(){
  Scanner sc=new Scanner(System.in);
    try{
    File f=new File("new.txt");
    File f2=new File("out txt");
    boolean x=f.createNewFile();
    boolean y=f2.createNewFile();
      if(x&&y){
        System.out.println("New file created.");
      }
      else{
        System.out.println("File already exists.");
      }
      System.out.println("Enter the contents to add in file: ");
      String s=sc.nextLine();
      FileWriter w=new FileWriter("new.txt");
      FileWriter w1=new FileWriter("out.txt");
      FileReader r=new FileReader("new.txt");
      w.write(s);
      w.close();
      String str="";
      int i;
      System.out.println("Data has been succesfully written to file");
      while((i=r.read())!=-1){
        str+=(char)i;
      }
      r.close();
      w1.write(str);
      w1.close();
    }
    catch(Exception e)
      {
        System.out.println(e);
      }
  }
}
class Main{
  public static void main(String[] args){
    File1 x=new File1();
    x.copy();
  }
}
