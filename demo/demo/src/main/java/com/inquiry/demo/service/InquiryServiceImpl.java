package com.inquiry.demo.service;

import com.inquiry.demo.model.UserInquiry;
import com.inquiry.demo.repository.InquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InquiryServiceImpl implements InquiryService {

    @Autowired
    private InquiryRepository inquiryRepository;

    @Override
    public UserInquiry saveInquiry(UserInquiry userInquiry) {
        inquiryRepository.save(userInquiry);
        return userInquiry;
    }
}
