package com.inquiry.demo;

import com.inquiry.demo.model.UserInquiry;
import com.inquiry.demo.service.InquiryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class InquiryTest {

    @Autowired
    private InquiryService inquiryService;

    @Test
    public void testSaveInquiry() {
        UserInquiry inquiry = new UserInquiry();
        inquiry.setName("Test User");
        inquiry.setContact("9876543210");
        inquiry.setEmail("test@example.com");
        inquiry.setLocation("Test City");
        inquiry.setComments("This is a test comment");

        UserInquiry savedInquiry = inquiryService.saveInquiry(inquiry);
        assertNotNull(savedInquiry.getId());
        assertEquals("Test User", savedInquiry.getName());
    }
}
