package cjf.com.community1.dto;

import lombok.Data;

/**
 * @author xiaochen
 * @data 2020/11/19 14:42
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;

}
