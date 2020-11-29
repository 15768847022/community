package cjf.com.community1.model;

import lombok.Data;

/**
 * @author xiaochen
 * @data 2020/11/24 20:13
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmt_create;
    private Long gmt_modified;
    private Integer creator;
    private Integer view_count;
    private Integer comment_count;
    private Integer like_count;



}
