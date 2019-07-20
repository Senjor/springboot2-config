/**
 * Copyright (C), 2009-2019, 智游集团
 * FileName: BookController
 * Author:   laosun
 * Date:     2019/7/13 2:52 PM
 * Description:
 */
package com.zhiyou.springboot2config.controller;

import com.zhiyou.springboot2config.config.BookComponent;
import com.zhiyou.springboot2config.config.BookProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {


    @Autowired
    private BookProperties bookProperties;

    @Autowired
    private BookComponent bookComponent;

    @GetMapping("/book/hello")
    public String sayHello() {

        return bookProperties.getName() + "------" + bookProperties.getWriter();
    }

    @GetMapping("/book/hello1")
    public String sayHello1() {

        return bookComponent.getName() + "------" + bookComponent.getWriter();
    }

}
