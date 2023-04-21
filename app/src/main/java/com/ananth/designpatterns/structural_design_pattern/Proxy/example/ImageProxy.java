package com.ananth.designpatterns.structural_design_pattern.Proxy.example;

//Proxy class
public class ImageProxy implements Image {

    private String fileName;
    private BitmapImage bitmapImage;

    private Point2D location;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void setLocation(Point2D point2D) {
        if (bitmapImage != null) {
            bitmapImage.setLocation(point2D);
        } else {
            location = point2D;
        }
    }

    @Override
    public Point2D getLocation() {
        if (bitmapImage != null) {
            return bitmapImage.getLocation();
        } else {
            return location;
        }
    }

    @Override
    public void render() {
        if (bitmapImage == null) {
            bitmapImage = new BitmapImage(fileName);
            if (location != null) {
                bitmapImage.setLocation(location);
            }
        }
        bitmapImage.render();
    }
}
