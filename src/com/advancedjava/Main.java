package com.advancedjava;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Socket socket= new Socket("localhost", 9999);
        OutputStream outputStream = socket.getOutputStream();

        OutputStreamWriter writer  = new OutputStreamWriter(outputStream);
        writer.write("salut");
        writer.write("\n");


        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line =scanner.nextLine();
            if( line.equalsIgnoreCase("END")) {
                writer.write(line);
                writer.write("\n");
                break;
            }else {
                writer.write(line);
                writer.write("\n");
            }
            }
        writer.close();

    }
}
