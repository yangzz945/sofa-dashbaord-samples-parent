package io.sofastack.ark.biz.provider.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import io.sofastack.ark.biz.facade.SofaJvmService;
import org.springframework.stereotype.Service;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/3/19 6:11 PM
 * @since:
 **/
@SofaService
@Service
public class SofaJvmServiceImpl implements SofaJvmService {

    @Override
    public String test() {
        return "second version biz";
    }
}
