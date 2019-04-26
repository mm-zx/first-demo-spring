package com.maimang.springProject;

import com.maimang.sys.controller.HelloController;
import com.maimang.sys.entity.User;
import com.maimang.sys.mapper.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringProjectApplicationTests {
  private MockMvc mvc;
  @Autowired private UserRepository userRepository;

  @Before
  public void setUp() {
    mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
  }

  @Test
  public void contextLoads() throws Exception {
    mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(content().string(equalTo("hello world")));
  }

  @Test
  public void test() throws Exception {
    List<User> userList = new ArrayList<>();
    userList.add(new User("aa", "pwd","role","permission"));
    userList.add(new User("bb", "pwd","role","permission"));
    userList.add(new User("cc", "pwd","role","permission"));
    userList.add(new User("dd", "pwd","role","permission"));
    userRepository.saveAll(userList);
    Assert.assertEquals(4, userRepository.findAll().size());
  }
}
