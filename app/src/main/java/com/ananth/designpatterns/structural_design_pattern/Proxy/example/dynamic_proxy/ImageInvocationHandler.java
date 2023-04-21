package com.ananth.designpatterns.structural_design_pattern.Proxy.example.dynamic_proxy;

import com.ananth.designpatterns.structural_design_pattern.Proxy.example.BitmapImage;
import com.ananth.designpatterns.structural_design_pattern.Proxy.example.Image;
import com.ananth.designpatterns.structural_design_pattern.Proxy.example.Point2D;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//Implement invocation handler. Your "proxy" code goes here.
public class ImageInvocationHandler implements InvocationHandler {

    private String filename;
    private Point2D location;
    private BitmapImage image;
    private static final Method setLocationMethod;
    private static final Method getLocationMethod;
    private static final Method renderMethod;

    //cache method for later comparison
    static {
        try {
            setLocationMethod = Image.class.getMethod("setLocation", new Class[]{Point2D.class});
            getLocationMethod = Image.class.getMethod("getLocation", null);
            renderMethod = Image.class.getMethod("render", null);
        } catch (NoSuchMethodException e) {
            throw new NoSuchMethodError(e.getMessage());
        }
    }

    public ImageInvocationHandler(String filename) {
        this.filename = filename;
    }

    //This method is called for every method invocation on the proxy
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        //You can implement proxy logic here
        System.out.println("Invoking methood: "+method.getName());
        if(method.equals(setLocationMethod)) {
            return handleSetLocation(objects);
        } else if(method.equals(getLocationMethod)) {
            return handleGetLocation();
        } else if(method.equals(renderMethod)) {
            return handleRender();
        }
        return null;
    }

    //We create real object only when we really need it
    private Object handleRender() {
        if(image == null) {
            image = new BitmapImage(filename);
            if(location!=null){
                image.setLocation(location);
            }
        }
        image.render();
        return null;
    }

    private Point2D handleGetLocation() {
        if(image != null) {
            return image.getLocation();
        } else {
            return this.location;
        }
    }

    private Object handleSetLocation(Object[] args) {
        if(image != null) {
            image.setLocation((Point2D)args[0]);
        } else {
            this.location = (Point2D)args[0];
        }
        return null;
    }
}
