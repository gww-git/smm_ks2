package test;


import com.sz.entity.Items;
import com.sz.service.IPapersService;
import com.sz.service.IUserService;
import com.sz.service.ItemsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class test {



    @Autowired
    private IUserService userService;

    @Autowired
    private IPapersService papersService;

    @Autowired
    private ItemsService itemsService;


    @Test
    public void test1(){
        System.out.println(userService.select().get(0).getUname());
    }


    @Test
    public void test2(){
        System.out.println(papersService.ByPapersAll());
    }

    @Test
    public void test3(){
        List<Items> items = itemsService.ByItemsAll(1);
        System.out.println(items);
    }
}
