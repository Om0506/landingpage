package com.example.landingpage.service;

import com.example.landingpage.model.ContactRequest;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    public void processContact(ContactRequest request) {
        System.out.println("=========================================");
        System.out.println(" NEW CONTACT FORM SUBMISSION");
        System.out.println("=========================================");
        System.out.println();
        System.out.println("Name    : " + request.getName());
        System.out.println();
        System.out.println("Email   : " + request.getEmail());
        System.out.println();
        System.out.println("Message :");
        System.out.println(request.getMessage());
        System.out.println();
        System.out.println("=========================================");
    }
}
