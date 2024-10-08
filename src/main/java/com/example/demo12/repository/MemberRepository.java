package com.example.demo12.repository;

import com.example.demo12.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    //세부 구현 하지 않고 제작 가능
    Member findByEmail(String email);

    List<Member> findAll(); //테이블 안의 모든 데이터를 가져옴
    //가져온 데이터를 List에 담아서 반환

}
