package cjf.com.community1.dto;

import cjf.com.community1.model.User;
import lombok.Data;

/**
 * @author xiaochen
 * @data 2020/11/29 10:17
 */
@Data
public class QuestionDTO {
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
    private User user;
}
