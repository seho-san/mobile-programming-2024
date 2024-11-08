package com.example.demo12.service;

import com.example.demo12.model.Member;
import com.example.demo12.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
    //@Autowired 사용 지양됨 -> @RequiredArgsConstructor 로 생성되는 생성자로 주입받기 위해 final 붙임.
    private final MemberRepository memberRepository;

    public List<Member> getMemberLists(){
        List<Member> listMembers;
        listMembers = memberRepository.findAll();

        //List<Member> resultList = listMembers.stream().map(member -> modelMapper.map(member, MemberDTO.class)).collect(Collectors.toList());
        //return resultList;

        return listMembers;
    }
}