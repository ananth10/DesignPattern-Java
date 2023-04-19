package com.ananth.designpatterns.structural_design_pattern.composite.example;

public class Client {

    public static void main(String[] args){
     File root1 = createTreeOne();
     root1.ls();
        System.out.println("*****************");
     File file2 = createTreeTwo();
     file2.ls();
    }

    //Client builds tree using leaf and composites
    private static File createTreeOne(){
        File file1 = new BinaryFile("File1",1000);
        Directory directory = new Directory("directory1");

        directory.addFile(file1);
        File file2 = new BinaryFile("File2",1000);
        File file3 = new BinaryFile("File3",1000);
        Directory directory2 = new Directory("directory2");
        directory2.addFile(file2);
        directory2.addFile(file3);
        directory2.addFile(directory);
        return directory2;
    }

    private static File createTreeTwo(){
        return new BinaryFile("Another file",200);
    }
}
