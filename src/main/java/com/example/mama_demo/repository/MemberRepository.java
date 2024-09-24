// MemberRepository.java
package com.example.mama_demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.mama_demo.model.Member;

public interface MemberRepository extends MongoRepository<Member, String> {
    Member findByEmail(String email);
}