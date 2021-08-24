package com.eight.glyxyxt;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class GlyxyxtMasterApplicationTests {
    
  /*  @Autowired
    DBDToBean dbdToBean;*/
    
    @Test
    void contextLoads() {
    }
   /* @Test
    public void getDbdToBean() throws IOException, SQLException {
        int i = 0;
        dbdToBean.setPackageName("com.eight.glyxyxt.dataobject");
        dbdToBean.setComment(true);
        dbdToBean.setFieldNameIsLower(false);
        
        *//*String admin = dbdToBean.generateAttrFromTable("bxqy");
        System.out.println(admin);*//*
        
        HashMap<String, String> hashMap = dbdToBean.generateAttrFromDataBase();
        dbdToBean.exportToFile(hashMap);
        dbdToBean.closeConnection();
    }

    @Test
    public void getDbdToBeanInfo() {
        LogInfo logInfo = new LogInfo();
        String s = logInfo.logInfo();
        System.out.println(s);
    }*/
}
