##码匠社区

##资料
[Spring 文档](http://spring.io/guides)
[spring web](https://spring.io/guides/gs/serving-web-content/)
[es](https://elasticsearch.cn/explore)
[github deploy key](https://developer.github.con/v3/guides/managing-deploy-keys/#deploy-keys)
[bootstrap](https://v3.bootcss.com/getting-started/)
[github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)
[Spring](https://docs.spring.io/spring-boot/docs/2.0.0RC1/reference/htmlsingle/#boot-features-embedded-database-support)


##工具
[Git](https://git-scm.com/download)
[visual-paradigm](https://www.visual-paradigm.com)
[flyway](https://www.runoob.com/mysql-insert-query.html)
[Lambok](https://projectlombok.org/)
[接口]（https://api.github.com/users/15768847022）
[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#setting-attribute-values)


##脚本
'''sql
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` varchar(100) DEFAULT NULL,
  `name` varchar(50),
  `token` char(36),
  `gmt_create` bigint(20),
  `gmt_modified` bigint(20),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1

'''

'''bash
mvn flyway:migrate
'''