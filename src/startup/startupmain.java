package startup;

import java.io.IOException;
import java.io.PrintWriter;

public class startupmain {

    public static void main(String[] args) throws IOException {

        PrintWriter out = new PrintWriter("startup.bat");
        out.println("cd C:\\WINDOWS\\system32");
        out.println("color a");
        out.println("Test");
        out.println("exit");
        out.close();
        Runtime rt = Runtime.getRuntime();
        rt.exec("cmd /c start startup.bat");


    }
}