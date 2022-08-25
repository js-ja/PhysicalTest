package com.mrt;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mrt.dao.mapper.PhysicalTestMapper;
import com.mrt.domain.PhysicalTestProject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootMrtApplicationTests {

    @Autowired
    private PhysicalTestMapper physicalTestMapper;

    @Test
    void contextLoads() {
        int[] ints = new int[]{};
        System.out.println(ints.length);


    }
    @Test
    void find() {
        Integer count = physicalTestMapper.count();
        System.out.println(count);

    }
    @Test
    void find2() {
        LambdaQueryWrapper<PhysicalTestProject> lqw = new LambdaQueryWrapper<PhysicalTestProject>();

        lqw.eq(PhysicalTestProject::getStudentNumber,"1110117");
        List<PhysicalTestProject> physicalTestProjects = physicalTestMapper.selectList(lqw);
        System.out.println(physicalTestProjects);
    }

}
