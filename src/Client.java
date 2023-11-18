import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket cs = new Socket("192.168.29.200", 80);
        BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
        String temp="0";
        while(!temp.equals("term")) {
            temp = br.readLine();
            System.out.println("Msg from server: "+temp);
        }
        if(temp.equals("term")) {
            System.out.println("CONNECTION TERMINATED! THANK YOU.");
            cs.close();
            br.close();
        }
    }
}
