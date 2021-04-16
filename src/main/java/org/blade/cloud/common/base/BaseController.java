package org.blade.cloud.common.base;

import com.baomidou.mybatisplus.extension.service.IService;
import org.blade.cloud.common.BaseResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;

/**
 * @author lyq on 2021-04-17 上午12:03
 * @desc
 */
public class BaseController<S extends IService, T extends BaseEntity> {

    @Resource
    protected S service;

    @PostMapping
    public BaseResult<Boolean> save(@Validated @RequestBody T t) {
        boolean res = service.save(t);
        return BaseResult.success(res);
    }

    @DeleteMapping("/{id}")
    public BaseResult<Boolean> deleteByPrimary(@PathVariable Long id) {
        boolean res = service.removeById(id);
        return BaseResult.success(res);
    }

}
