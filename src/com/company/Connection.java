package com.company;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Connection {

    public void startClient(){
        try {
            Socket clS = new Socket("188.134.66.216", 25017);
            ReadServer rs = new ReadServer(clS);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(clS.getOutputStream()));
        while(true){
            //
            //System.out.println("Введите сообщение для отправки:");
            //bw.write(new Scanner(System.in).next());
            //bw.flush();
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
