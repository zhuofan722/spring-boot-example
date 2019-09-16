package com.example.validation.web;

import com.example.validation.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * .
 *
 * @author wangzhuofan@beyondsoft.com
 * @version 1.0
 * @date 2019-09-11
 */
@RestController
public class ValidationController {
    private static final Logger log = LoggerFactory.getLogger(ValidationController.class);

    /**
     * 验证框架使用测试
     *
     * @param user
     * @param result
     */
    @PostMapping("/check")
    public void v1(@RequestBody @Valid User user, BindingResult result) {
//        StringBuilder sBuilder = new StringBuilder();
//        sBuilder.append("\n");
//        if (result.hasErrors()) {
//            List<ObjectError> list = result.getAllErrors();
//            for (ObjectError error : list) {
//                log.info(error.getCode() + "---" + error.getArguments() + "---" + error.getDefaultMessage());
//                System.out.println(error.toString());
//                sBuilder.append(error.getDefaultMessage());
//                sBuilder.append("\n");
//            }
//        }
//        log.info(sBuilder.toString());


        if(result.hasErrors()){
            List<ObjectError> ls=result.getAllErrors();
            for (int i = 0; i < ls.size(); i++) {
                System.out.println("error:"+ls.get(i));
            }
        }
    }
}