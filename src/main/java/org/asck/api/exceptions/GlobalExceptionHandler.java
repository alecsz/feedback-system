package org.asck.api.exceptions;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ResponseStatus
public class GlobalExceptionHandler{
	private static final Logger LOGGER = LogManager.getLogger(GlobalExceptionHandler.class);
	
	private static final long serialVersionUID = 1L;
	
	protected ModelAndView handleError(HttpServletRequest req, RuntimeException exception) throws Exception {

		if (AnnotationUtils.findAnnotation(exception.getClass(), ResponseStatus.class) != null)
			throw exception;

		LOGGER.error("Request: " + req.getRequestURI() + " raised " + exception);

		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", exception);
		mav.addObject("url", req.getRequestURL());
		mav.addObject("timestamp", new Date().toString());
		mav.addObject("status", 500);

		mav.setViewName("error");
		return mav;

	}
}
