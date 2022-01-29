package com.sdkj.boot.mapper;

import com.sdkj.boot.domain.Data;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface DataMapper {

    //依据资料类型查询
    List<Data> QueryData(String DataType);

    List<Data> SearchData();

    Integer InsertData(String type,String address,String password,String content);

    Data SelectById(String id);

    //根据id，更新数据
    Integer UpdateById(String id,String type,String address,String password,String content);


    //根据id，进行删除
    Integer DeleteById(String id);

}
