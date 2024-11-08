package com.example.demo12.controller;

import com.example.demo12.dto.ItemDTO;
import com.example.demo12.model.Member;
import com.example.demo12.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private final MemberService memberService;

    public IndexController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping(value = "/test")
    public String test() {
        return "test";
    }

    @GetMapping(value = "/param1")
    public String minchoi(@RequestParam("name") String name, Model model) {
        model.addAttribute("data", "데이터 수신");
        model.addAttribute("username", name);
        return "/thymeleaf/param1";
    }

    @GetMapping(value = "/param2")
    public String dtoexample(ItemDTO item, Model model) {
        model.addAttribute("itemname", item.getItemname());
        model.addAttribute("itemprice", item.getItemprice());

        return "/thymeleaf/param6re";
    }
   /*
    @PostMapping(value = "/param3")
    public String jsonexample(@RequestBody ItemDTO item, Model model) {
        model.addAttribute("itemname", item.getItemname());
        model.addAttribute("itemprice", item.getItemprice());

        List<Member> arrlist = memberService.getMemberLists();

        return "/thymeleaf/param6re";
    }
*/
       @ResponseBody
       @GetMapping(value = "/param3")
       public List<Member> jsonexample(Model model) {
           //model.addAttribute("itemname", item.getItemname());
           //model.addAttribute("itemprice", item.getItemprice());

           List<Member> arrlist = memberService.getMemberLists();

           return arrlist;
       }

    /*@ResponseBody
    @PostMapping(value = "/param3")
    public List<Member> jsonexample(@RequestBody ItemDTO item, Model model) {
        //model.addAttribute("itemname", item.getItemname());
        //model.addAttribute("itemprice", item.getItemprice());

        List<Member> arrlist = memberService.getMemberLists();
        model.addAttribute("itemprice",arrlist);

        return arrlist;
    }*/
}
