package com.technicalshool.techincalschool;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import com.technicalshool.controller.TechSchoolController;
import com.technicalshool.service.TechSchoolService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;

@WebMvcTest(TechSchoolController.class)
public class TechSchoolControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TechSchoolService techSchoolService;


    @Test
    public void testController() throws Exception {
        String expectedResponse = "This is the first method to test controller";
        when(techSchoolService.testController()).thenReturn(expectedResponse);

        mockMvc.perform(get("/techschool/test"))
                .andExpect(status().isOk())
                .andExpect(content().string(expectedResponse));
    }
}
