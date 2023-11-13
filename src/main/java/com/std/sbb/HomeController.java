package com.std.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//
// 개발자가 스트링부트한테 말한다.
// 아래 있는 HomeController 는 컨트롤러이다.
@Controller
public class HomeController {
    // 개발자가 스트링부트한테 말한다.
    // 만약에 /home/main 이런 요청이 오면 아래 메서드를 실행해줘.
    // @GetMapping("/home/main") 의 의미
    @ResponseBody
    @GetMapping("/home/main")
    public String ShowMain(){
        return "안녕하세요.";
    }
    @ResponseBody
    @GetMapping("/home/main2")
    public String ShowMain2(){
        return "반갑습니다.";
    }
    @ResponseBody
    @GetMapping("/home/main3")
    public String ShowMain3(){
        return "즐거웠습니다.";
    }
}
