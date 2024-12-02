import java.io.PrintWriter;
public class printwriter{
    public static void main(String args[])
    {
        PrintWriter pw=new PrintWriter(System.out);
        pw.println("hello world");
        pw.print("this isn a");
        pw.print("print statement");
        pw.close();
    }
}
    