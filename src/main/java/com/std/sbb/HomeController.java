package com.std.sbb;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

//
// 개발자가 스트링부트한테 말한다.
// 아래 있는 HomeController 는 컨트롤러이다.
@Controller
public class HomeController {
    private List<Person> people;

    HomeController() {
        people = new ArrayList<>();
    }

    // 개발자가 스트링부트한테 말한다.
    // 만약에 /home/main 이런 요청이 오면 아래 메서드를 실행해줘.
    // @GetMapping("/home/main") 의 의미
    //@RequestParam는 생략가능
   @GetMapping("/home/addPerson")
   @ResponseBody
    public String retunrPerson(@RequestParam(defaultValue = "0") int age,@RequestParam(defaultValue = "null") String name) {
       Person person = new Person(name, age);


       person.getId();
       person.getAge();
       person.getName();

       people.add(person);

       return person.getId() + "번 사람이 추가되었습니다.";

   }
    @GetMapping("/home/people")
    @ResponseBody
    public List<Person> showPeople(){

        return people;
    }
}
@Getter
@Setter
@AllArgsConstructor
class Person{
    private static int lastId;
    private final int id;
    private final String name;
    private final int age;

    static {
        lastId = 0;
    }
    Person(String name, int age){
        this.id  = lastId++;
        this.age = age;
        this.name = name;
    }
}