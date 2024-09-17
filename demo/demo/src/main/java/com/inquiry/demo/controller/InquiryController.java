package com.inquiry.demo.controller;

import com.inquiry.demo.model.UserInquiry;
import com.inquiry.demo.service.InquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inquiry")
public class InquiryController {
    @Autowired
    private InquiryService inquiryService;

    public InquiryController(InquiryService inquiryService) {
        this.inquiryService = inquiryService;
    }

    @PostMapping("/submit")
    public ResponseEntity<String> submitInquiry(@RequestBody UserInquiry inquiry) {
        // Log the incoming data
        System.out.println("Received inquiry: " + inquiry);

        // Save the inquiry
        inquiryService.saveInquiry(inquiry);

        return ResponseEntity.ok("Inquiry submitted successfully!");
    }
}
