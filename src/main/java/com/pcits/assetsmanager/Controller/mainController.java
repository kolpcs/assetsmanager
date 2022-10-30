package com.pcits.assetsmanager.Controller;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class mainController {
    @RequestMapping(value = "/")
    public  void redirect(HttpServletResponse response) throws IOException {
                response.sendRedirect("/");
          }

}
