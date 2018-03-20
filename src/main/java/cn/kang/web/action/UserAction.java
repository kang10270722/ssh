package cn.kang.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Controller;


@Controller("userAction")
public class UserAction extends ActionSupport {
    public UserAction() {
        System.out.println("create-----l--");
    }
    public String index() {
        System.out.println("update --------0000--jrebel");
        return SUCCESS;
    }
}
