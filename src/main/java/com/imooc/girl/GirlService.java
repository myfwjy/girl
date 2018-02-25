package com.imooc.girl;

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
}
