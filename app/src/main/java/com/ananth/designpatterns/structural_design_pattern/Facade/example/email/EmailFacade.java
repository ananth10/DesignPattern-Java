package com.ananth.designpatterns.structural_design_pattern.Facade.example.email;

import com.ananth.designpatterns.structural_design_pattern.Facade.example.Order;

//Facade provides the simple method for client to use
public class EmailFacade {

    public boolean sendOrderEmail(Order order){
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
