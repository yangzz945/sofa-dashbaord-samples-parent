package io.sofastack.ark.biz.hostapp.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import io.sofastack.ark.biz.facade.SofaJvmService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/3/19 6:51 PM
 * @since:
 **/
@RestController
public class TestController {

    @SofaReference
    SofaJvmService sofaJvmService;

    @RequestMapping("test")
    public String test(){
        return sofaJvmService.test();
    }
}
