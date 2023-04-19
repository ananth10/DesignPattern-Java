package com.ananth.designpatterns.structural_design_pattern.Facade.example;

import com.ananth.designpatterns.structural_design_pattern.Facade.example.email.Email;
import com.ananth.designpatterns.structural_design_pattern.Facade.example.email.EmailFacade;
import com.ananth.designpatterns.structural_design_pattern.Facade.example.email.Mailer;
import com.ananth.designpatterns.structural_design_pattern.Facade.example.email.Stationary;
import com.ananth.designpatterns.structural_design_pattern.Facade.example.email.StationaryFactory;
import com.ananth.designpatterns.structural_design_pattern.Facade.example.email.Template;
import com.ananth.designpatterns.structural_design_pattern.Facade.example.email.TemplateFactory;

public class Client {

    public static void main(String[] args){

        Order order = new Order("101",99.00);

        EmailFacade facade = new EmailFacade();
        boolean result = facade.sendOrderEmail(order);
//        boolean result = sendOrderEmailWithoutFacade(order);

        System.out.println("Order Email "+ (result?"sent!":"NOT sent..."));
    }

    private static boolean sendOrderEmailWithoutFacade(Order order){
        Template template = TemplateFactory.createTemplateFor(Template.TemplateType.Email);
        Stationary stationary = StationaryFactory.createStationary();
        Email email = Email.getBuilder()
                .withTemplate(template)
                .withStationary(stationary)
                .forObject(order)
                .build();
        Mailer mailer = Mailer.getMailer();
        return mailer.send(email);

    }
}
