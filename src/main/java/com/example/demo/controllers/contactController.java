package com.example.demo.controllers;

import com.example.demo.model.Contact;
import com.example.demo.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("/contacts")
public class contactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/all")
    public ResponseEntity<List<Contact>> getallContacts(){
        List<Contact> contacts = contactService.findAllContacts();
        return new ResponseEntity<>(contacts, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Contact> addContact(@RequestBody  Contact contact) {
        contact.setId(Long.getLong(UUID.randomUUID().toString()));
        contactService.addContact(contact);
        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }
}
