package com.elf.mapper;



import com.elf.domain.AfterSale;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface AfterMapper {

    AfterSale findOne(@Param("id")Integer id);



    Integer  addOne(@Param("name") AfterSale afterSale);
    Integer  delete(@Param("name")AfterSale afterSale);
    Integer  update(@Param("name")AfterSale afterSale);

    List<AfterSale> check();


}
