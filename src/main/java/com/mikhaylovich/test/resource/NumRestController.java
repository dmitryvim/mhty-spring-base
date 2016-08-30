package com.mikhaylovich.test.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dmitry Mikhaylovich
 */
@RestController
@RequestMapping("/")
public class NumRestController {

    private int count = 0;

    @RequestMapping("/count")
    public Integer getCount() {
        return this.count++;
    }
}
