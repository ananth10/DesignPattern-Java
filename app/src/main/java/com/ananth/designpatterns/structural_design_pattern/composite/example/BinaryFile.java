package com.ananth.designpatterns.structural_design_pattern.composite.example;



//Leaf node in composite pattern
public class BinaryFile extends File{

    private long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(getName()+"\t"+size);
    }

    @Override
    public void addFile(File file) {
      throw new UnsupportedOperationException("Leaf node does not support add operation");
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("Leaf node does not support get operation");
    }

    @Override
    public boolean removeFile(File file) {
        throw new UnsupportedOperationException("Leaf node does not support remove operation");
    }
}
