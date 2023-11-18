import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    public static void main(String[] args) throws Exception {
        String msg;
        Scanner read = new Scanner(System.in);
        ServerSocket ss = new ServerSocket(80);
        Socket s1 = ss.accept();
        while(true) {
            System.out.print("Enter message: ");
            msg = read.next();
            PrintStream ps = new PrintStream(s1.getOutputStream());
            ps.println(msg);
            if(msg.equals("term")) break;
        }
        read.close();
        s1.close();
        ss.close();
    }
}