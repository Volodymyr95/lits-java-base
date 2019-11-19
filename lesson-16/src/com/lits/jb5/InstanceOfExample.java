package com.lits.jb5;

import java.util.Objects;

public class InstanceOfExample {
    public static void main(String[] args) {

        var s = new MailSender();

        if (s instanceof MailSender) {
            System.out.println("Mail");
        }


    }
}
