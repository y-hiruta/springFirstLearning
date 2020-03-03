package jp.co.lsstyle.y.hiruta;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.co.lsstyle.y.hiruta.forms.SampleForm;

@Controller
public class DemoFormController {

	@RequestMapping(value = "/demo/form" ,method = RequestMethod.GET)
	private ModelAndView init(@ModelAttribute SampleForm form ,ModelAndView mav) {

		mav.setViewName("demo_form");
		return mav;
	}


}
