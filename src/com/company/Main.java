package com.company;

import java.net.ConnectException;

public class Main {

    public static void main(String[] args) {
        Connection con = new Connection();
        con.startClient();
    }
}
