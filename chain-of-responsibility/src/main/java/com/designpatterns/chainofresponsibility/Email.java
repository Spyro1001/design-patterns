package com.designpatterns.chainofresponsibility;

import lombok.Data;

@Data
public class Email {

    String to;
    String from;
    String subject;
    String body;
    String signature;



}
