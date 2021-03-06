package me.mushen.example.springmvc.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @Desc
 * @Author Remilia
 * @Create 2017-07-27
 */
public class HomeControllerTest {

    @Test
    public void testHome() throws Exception {
        HomeController homeController = new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();

        mockMvc.perform(MockMvcRequestBuilders.get("/"))
               .andExpect(MockMvcResultMatchers.view().name("home"));
    }
}
