package test.spring.bean;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class HelloBean {

	@RequestMapping("/test.do")
	public String test(MultipartHttpServletRequest request) throws Exception {
		MultipartFile file = request.getFile("upload");
		String name = file.getOriginalFilename();
		File sf = new File("e://save//" + name);
		file.transferTo(sf);
		return "/test/fileupload.jsp";
	}
}
