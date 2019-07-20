/**
 * Copyright (C), 2009-2019, 智游集团
 * FileName: BookProperties
 * Author:   laosun
 * Date:     2019/7/13 3:03 PM
 * Description:
 */
package com.zhiyou.springboot2config.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//Spring IOC
@Data//lombok
public class BookProperties {

    @Value("${demo.book.name}")
    private  String name;

    @Value("${demo.book.writer}")
    private  String writer;

}
