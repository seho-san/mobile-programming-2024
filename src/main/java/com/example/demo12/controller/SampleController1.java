package com.example.demo12.controller;

import com.example.demo12.dto.BoardDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Controller 어노테이션을 붙여줘야 컨트롤러로 사용 가능
public class SampleController1 {

    @GetMapping(value = "sample1") //localhost:8080/sample1로 접속하면 아래의 함수가 실행됨
    public String sample1(Model model) {

        BoardDTO boarddto = new BoardDTO(1, "board 객체", "작성자1");
        model.addAttribute("boardDTO", boarddto);
        return "sample1";
    }



}
