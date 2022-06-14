package org.wecancodeit.librarydemo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.librarydemo.repositories.BookRepository;

import javax.annotation.Resource;

@Controller
public class BookController {

    @Resource
    private BookRepository bookRepo;

    @RequestMapping("/books")
    public String displayBooks(Model model){
        model.addAttribute("books", bookRepo.findAll());
        return "booksView";
    }
}
