package eki.wordweb.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import eki.common.util.CodeGenerator;
import eki.wordweb.constant.WebConstant;

@ConditionalOnWebApplication
@ControllerAdvice
public class ExceptionHandlerController implements WebConstant {

	private static Logger logger = LoggerFactory.getLogger(ExceptionHandlerController.class);

	@ExceptionHandler(Exception.class)
	public ModelAndView exception(Exception exception) throws Exception {

		ModelAndView modelAndView = new ModelAndView();
		if (exception instanceof HttpSessionRequiredException) {
			modelAndView = new ModelAndView();
			modelAndView.setViewName("redirect:/");
			return modelAndView;
		}

		if (AnnotationUtils.findAnnotation(exception.getClass(), ResponseStatus.class) != null) {
			throw exception;
		}

		String errorId = "ERR-ID:" + CodeGenerator.generateUniqueId();
		logger.error(errorId, exception);

		modelAndView = new ModelAndView();
		modelAndView.addObject("errorName", exception.getMessage());
		modelAndView.addObject("errorId", errorId);
		modelAndView.addObject("errorDescription", exception.toString());
		modelAndView.setViewName(ERROR_PAGE);
		return modelAndView;
	}
}