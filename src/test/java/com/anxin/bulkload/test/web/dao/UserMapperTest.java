package com.anxin.bulkload.test.web.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.anxin.bulkload.core.feature.orm.mybatis.Page;
import com.anxin.bulkload.test.core.feature.TestSupport;
import com.anxin.bulkload.web.dao.UserMapper;
import com.anxin.bulkload.web.model.User;
import com.anxin.bulkload.web.model.UserExample;

public class UserMapperTest extends TestSupport {
    @Resource
    private UserMapper userMapper;

    @Test
    public void test_selectByExampleAndPage() {
        start();
        Page<User> page = new Page<>(1, 3);
        UserExample example = new UserExample();
        example.createCriteria().andIdGreaterThan(0L);
        final List<User> users = userMapper.selectByExampleAndPage(page, example);
        for (User user : users) {
            System.err.println(user);
        }
        end();
    }
}
