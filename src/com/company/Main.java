package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner (System.in);
        String data = in.nextLine();
        String[] aData = data.split("\\s+");

        BinaryTree tree = new BinaryTree(Integer.parseInt(aData[0]));
        for(int i=1; i<aData.length; i++){
            int num = Integer.parseInt(aData[i]);
            tree.addNode(num);
        }
        System.out.print("LVR-> ");
        tree.LVR();
        System.out.println("");
        System.out.print("RVL-> ");
        tree.RVL();
        System.out.println("");
        System.out.print("VLR-> ");
        tree.VLR();
        System.out.println("");
        System.out.print("VRL-> ");
        tree.VRL();
        System.out.println("");
        System.out.print("LRV-> ");
        tree.LRV();
        System.out.println("");
        System.out.print("RLV-> ");
        tree.RLV();


    }

    private String[] clean(String[] purple){

        purple = Arrays.stream(purple)
                .filter(s -> (s != null && s.length() > 0))
                .toArray(String[]::new);

        return purple;
    }
}
