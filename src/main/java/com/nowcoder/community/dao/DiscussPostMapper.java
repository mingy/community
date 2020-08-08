package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 24912
 */
@Repository
public interface DiscussPostMapper {
    /**
     * 查询
     * @param userId
     * @param offset 每一页起始行行号
     * @param limit 每一页的条数
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // @Param注解用于给参数取别名,
    // 如果只有一个参数,并且在<if>里使用,则必须加别名.
    //userId是一个用于动态sql，动态条件，如果这种只有这一个条件，就一定要取别名，
    /**
     * 查询帖子的行数
     * @param userId
     * @return
     */
    int selectDiscussPostRows(@Param("userId") int userId);

}
