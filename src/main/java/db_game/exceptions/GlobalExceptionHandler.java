package db_game.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MaxTenPizzas.class)
    public String maxTenPizzasMessage(MaxTenPizzas maxTenPizzas, HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("error", maxTenPizzas.getMessage());
        String referer = httpServletRequest.getHeader("referer");
        return "redirect:" + referer;
    }

}
