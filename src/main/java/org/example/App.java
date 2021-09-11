package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */
public class App 
{
    public static void main( String[] args )
    {
        //Q_3
        Scanner sc = new Scanner(System.in);
        String quote, author;

        System.out.println("What is the quote?");
        quote = sc.nextLine();

        System.out.println("Who said it?");
        author = sc.nextLine();

        System.out.println(author + " says, \"" + quote + "\"");
    }
}
