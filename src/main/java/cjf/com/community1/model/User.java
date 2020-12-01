package cjf.com.community1.model;

import lombok.Data;

/**
 * @author xiaochen
 * @data 2020/11/23 8:59
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String account_id;
    private String token;
    private Long gmt_create;
    private Long gmt_modified;
    private String avatar_url;



}
