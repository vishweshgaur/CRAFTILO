package com.inquiry.demo.repository;

import com.inquiry.demo.model.UserInquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InquiryRepository extends JpaRepository<UserInquiry, Long> {
}
