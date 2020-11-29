package cjf.com.community1.dto;

import lombok.Data;

/**
 * @author xiaochen
 * @data 2020/11/18 14:40
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;


}
