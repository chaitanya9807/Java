import java.io.*;

public class FileRead_write {
    public static void main(String[] args){
        FileOutputStream fout;
        try{
            fout=new FileOutputStream("Myfile.txt");
            new PrintStream(fout).println("Java File");
            fout.close();
        }
        catch (IOException e) {
            System.out.println("Unable to write in file");
            System.exit(-1);
        }
        FileInputStream fin;
        FileInputStream fin2;
        FileInputStream fin3;
        try{
         fin=new FileInputStream("Myfile.txt");
         fin2=new FileInputStream("Myfile.txt");
         fin3=new FileInputStream("Myfile.txt");
         System.out.println("Reading Line by Line");
         System.out.println(new BufferedReader(new InputStreamReader(fin)).readLine());
         System.out.println("Reading char by char");
         Reader reader=new BufferedReader(new InputStreamReader(fin2));
         int r;
         while((r=reader.read())!=-1){
             char ch=(char)r;
             System.out.println(ch);
         }
         System.out.println("Reading byte by byte");
         final int EOF=-1;
         int singleByte=fin3.read();
         StringBuilder sb=new StringBuilder();
         while(singleByte!=EOF){
             sb.append((char)singleByte);
             singleByte=fin3.read();
         }
         String t=sb.toString();
         System.out.println(t);
        }catch (IOException e){
            System.out.println("Unable to read file");
            System.exit(-1);
        }
        finally{
            System.out.println("Made By Akshat Mangal");
        }
    }
}
