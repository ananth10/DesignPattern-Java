package com.ananth.designpatterns.structural_design_pattern.Decorator.example;

import android.text.Html;
import android.text.SpannableString;

import org.apache.commons.lang3.StringEscapeUtils;

//decorator class , implements the component
public class HtmlEncodingMessage implements Message {

    Message message;

    public HtmlEncodingMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(message.getContent());
    }
}
