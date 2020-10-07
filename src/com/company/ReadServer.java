package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReadServer extends Thread{
    Socket s;
    public ReadServer(Socket s){
        this.s = s;
        start();
    }
    @Override
    public void run() {
        while(true){
            try {
                BufferedReader buffer = new BufferedReader(new InputStreamReader(s.getInputStream()));
                System.out.println(buffer.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
