package com.example.landingpage.controller;

import com.example.landingpage.model.Contact;
import com.example.landingpage.service.ContactService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("contactRequest", new Contact());
        return "index";
    }

    @PostMapping("/contact")
    public String submitContact(@Valid @ModelAttribute("contactRequest") Contact contact,
                                BindingResult bindingResult,
                                Model model) {
        if (bindingResult.hasErrors()) {
            return "index";
        }

        contactService.processContact(contact);
        model.addAttribute("successMessage", "Thank you! Your message has been sent successfully.");
        model.addAttribute("contactRequest", new Contact());
        return "index";
    }

    @GetMapping("/contacts")
    @ResponseBody
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }
}
