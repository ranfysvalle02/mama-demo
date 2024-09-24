package com.example.mama_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.mama_demo.model.Member;
import com.example.mama_demo.repository.MemberRepository;
import java.util.Optional;
import java.util.List;

@SpringBootApplication
@RestController
public class MamaDemoApplication {

    @Autowired
    private MemberRepository memberRepository;

    public static void main(String[] args) {
        SpringApplication.run(MamaDemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
    @PostMapping("/register")
    public Member registerMember(@RequestBody Member newMember) {
        return memberRepository.save(newMember);
    }
    @GetMapping("/members")
    public List<Member> getMembers() {
        return memberRepository.findAll();
    }
    @GetMapping("/members/{id}")
    public Optional<Member> getMember(@PathVariable String id) {
        return memberRepository.findById(id);
    }
}