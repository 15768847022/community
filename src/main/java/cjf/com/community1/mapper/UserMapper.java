package cjf.com.community1.mapper;

import cjf.com.community1.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xiaochen
 * @data 2020/11/23 8:55
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user(id,name,account_id,token,gmt_Create,gmt_Modified) values(#{id},#{name},#{account_id},#{token},#{gmt_Create},#{gmt_Modified})")
    void insert(User user);

}
