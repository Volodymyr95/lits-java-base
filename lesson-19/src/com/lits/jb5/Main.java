
package com.lits.oop.lesson19;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        try(FileOutputStream fos = new FileOutputStream("/Users/volodymyrrachuk/Desktop/fileOutputStream.txt", false)) {
//            String test = "Hello java IO new way to close stream \n";
//            fos.write(test.getBytes());
//        } catch (IOException e) {
//            System.out.println("can not write file: " +  e.getMessage());
//        }

//        FileOutputStream fos;
//        try {
//            fos = new FileOutputStream("/Users/volodymyrrachuk/Desktop/fileOutputStream.txt", false);
//            String test = "Hello java IO \n";
//            fos.write(test.getBytes());
//            fos.close();
//        } catch (IOException e) {
//            System.out.println("can not write file: " +  e.getMessage());
//        } finally {
//            if (Objects.nonNull(fos)) {
//                fos.close();
//            }
//        }


//        FileInputStream fis = null;
//        BufferedInputStream bis = null;
//        try {
//            fis = new FileInputStream("/Users/volodymyrrachuk/Desktop/fileOutputStream.txt");
//            bis = new BufferedInputStream(fis);
//            int i = 0;
//            while ((i = bis.read()) != -1) {
//                System.out.println((char) i);
//            }
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            if (bis != null) {
//                bis.close();
//            }
//            if (fis != null) {
//                fis.close();
//            }
//        }


//        FileReader fis = null;
//        BufferedReader bis = null;
//        try {
//            fis = new FileReader("/Users/volodymyrrachuk/Desktop/fileOutputStream.txt");
//            bis = new BufferedReader(fis);
//            String i = "";
//            while ((i = bis.readLine()) != null) {
//                System.out.println(i);
//            }
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } finally {
//            if (bis != null) {
//                bis.close();
//            }
//            if (fis != null) {
//                fis.close();
//            }
//        }

//        FileOutputStream fos = new FileOutputStream("/Users/volodymyrrachuk/Desktop/fileOutputStream.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        String s = "say hello";
//        byte b[] = s.getBytes();
//        bos.write(b);
//        bos.flush();
//        bos.close();
//        fos.close();
//
//        FileWriter fw = new FileWriter("/Users/volodymyrrachuk/Desktop/fileOutputStream.txt");
//        fw.append("test");
//        fw.append(" we are trying file writer", 1, 3);
//        fw.close();

//        Console console = System.console();
//        System.out.println("Please enter your name:");
//        String name = console.readLine();
//        System.out.println("Welcome " + name);
//        System.out.println("Please enter your password:");
//        char[] password = console.readPassword();
//        System.out.println("your password is " + String.copyValueOf(password));

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Please enter your name:");
//        String name = br.readLine();
//        System.out.println("Welcome " + name);
//        while (true) {
//            String action = br.readLine();
//            if ("exit".equals(action)) {
//                break;
//            } else
//            if ("open".equals(action)) {
//                System.out.println("Zoo is open");
//            } else
//            if ("lunch".equals(action)) {
//                System.out.println("omnomnom");
//            } else {
//                System.out.println("Alexa does not know command " + action);
//            }
//        }
//
//        br.close();
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter your name:");
//        String name = in.nextLine();
//        System.out.println(name);
//        System.out.println("enter age");
//        System.out.println(in.nextInt());
//        in.close();
        Path path =  Paths.get("/Users/volodymyrrachuk/Desktop/fileOutputStream.txt");
        System.out.println(path.getFileName());
    }
}
