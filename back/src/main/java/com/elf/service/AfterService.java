package com.elf.service;




import com.elf.domain.AfterSale;

import java.util.List;

public interface AfterService {

    AfterSale findOne(Integer id);


   Integer addOne(AfterSale afterSale);

    Integer delete(AfterSale afterSale);

    Integer update(AfterSale afterSale);





    List<AfterSale> check();


}
