package com.imooc.girl.service;

import com.imooc.girl.Exception.GirlException;
import com.imooc.girl.domain.Girl;
import com.imooc.girl.enums.ResultEnum;
import com.imooc.girl.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {
        Girl girl1 = new Girl();
        girl1.setName("Amy");
        girl1.setAge(16);
        girlRepository.save(girl1);

        Girl girl2 = new Girl();
        girl2.setName("Tom");
        girl2.setAge(28);
        girlRepository.save(girl2);
    }

    public void getAge(Integer id) throws Exception {
        Girl girl = girlRepository.findOne(id);
        Integer age = girl.getAge();
        if (age < 10) {
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        } else if (age > 10 && age < 16) {
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }

    /**
     * 通过id查询
     *
     * @param id
     * @return
     */
    public Girl findOne(Integer id) {
        return girlRepository.findOne(id);
    }
}
