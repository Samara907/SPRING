package test.spring.bean;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloBean {
	
	/**
	 * @return
	 * @throws Exception
	 * new ModelAndView(bean name, parameter name, down file)
	 */
	@RequestMapping("/download.do")
	public ModelAndView down() throws Exception {
		File down = new File("e://save//temp.jpg");
		ModelAndView mv = new ModelAndView("download", "downloadFile", down);
		return mv;
	}
}
