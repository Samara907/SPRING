package test.spring.bean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestBean {

	@RequestMapping("/test.do")
	public String test () {
		System.out.println("Class TestBean Method test()");
		return "/test/test.jsp";
	}
}
