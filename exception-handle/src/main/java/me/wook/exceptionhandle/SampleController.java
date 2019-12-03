package me.wook.exceptionhandle;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@GetMapping("/hello")
	public String hello() {
		throw new SampleException("Exception Handle Test");
	}

//	@ExceptionHandler(SampleException.class)
//	public @ResponseBody AppError smpleError(SampleException e) {
//		AppError appError = new AppError();
//		appError.setMessage("error.app.key");
//		appError.setReason("IDK IDK IDK");
//		appError.setOriginMessage(e.getMessage());
//		return appError;
//	}
}
