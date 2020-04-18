package ru.sch2.b;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller

public class Controller {

    /*
    GET  - получить http://127.0.0.1/?name=Ivan&email=test@yandex.ru
    Корневой запрос: http://127.0.0.1/


    POST  - отправить http://127.0.0.1/
                     в теле запроса: name=Ivan&email=test@yandex.ru
     */

    @GetMapping(path="/")
    public String index() {
        return "index";
    }

    @GetMapping(path="/about")
    public String about() {
        return "about";
    }


    @GetMapping(path="/task")
    public String task() {
        return "task";
    }



}
