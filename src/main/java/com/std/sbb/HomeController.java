package com.std.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//
// 개발자가 스트링부트한테 말한다.
// 아래 있는 HomeController 는 컨트롤러이다.
@Controller
public class HomeController {
    int num = 0;
    // 개발자가 스트링부트한테 말한다.
    // 만약에 /home/main 이런 요청이 오면 아래 메서드를 실행해줘.
    // @GetMapping("/home/main") 의 의미
    @ResponseBody
    @GetMapping("/home/plus")
    public int ShowMain(@RequestParam(defaultValue = "0") int a ,@RequestParam(defaultValue = "0") int b ){
        return a+b;
    }
}