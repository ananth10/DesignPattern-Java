package com.ananth.designpatterns.creational_design_pattern.objectpool.example;

public class Client {

    public static final ObjectPool<Bitmap> bitmapPool = new ObjectPool<>(() -> new Bitmap("Logo.bmp"), 5);

    public static void main(String[] args) {
        Bitmap bitmap = bitmapPool.get();
        bitmap.setLocation(new Point2D(6, 6));

        Bitmap bitmap1 = bitmapPool.get();
        bitmap1.setLocation(new Point2D(10, 10));

        bitmap.draw();
        bitmap1.draw();

        bitmapPool.release(bitmap);
        bitmapPool.release(bitmap1);
    }
}
