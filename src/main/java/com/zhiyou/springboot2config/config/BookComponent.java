/**
 * Copyright (C), 2009-2019, 智游集团
 * FileName: BookComponent
 * Author:   laosun
 * Date:     2019/7/13 2:53 PM
 * Description:
 */
package com.zhiyou.springboot2config.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Component//spring IOC
@ConfigurationProperties(prefix = "zhiyou.book")//configuration processor
@Data//lombok

public class BookComponent {

    @NotEmpty
    private String name;

    @NotNull
    private String writer;

}
