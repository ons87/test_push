package com.example.demo.services;


import com.example.demo.model.Contact;
import com.example.demo.model.Employee;
import com.example.demo.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;


    public List<Contact> findAllContacts() {
        return contactRepository.findAll();
    }

    public void addContact(Contact contact) {
         contactRepository.save(contact);
    }
}
