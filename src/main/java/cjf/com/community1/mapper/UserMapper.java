package cjf.com.community1.mapper;

import cjf.com.community1.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author xiaochen
 * @data 2020/11/23 8:55
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user(id,name,account_id,token,gmt_Create,gmt_Modified,avatar_url) values(#{id},#{name},#{account_id},#{token},#{gmt_Create},#{gmt_Modified},#{avatar_url})")
    void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);

}
