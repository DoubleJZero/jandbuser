package jandbuser.api.controller;

import jandbuser.api.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class UserController {

    private final UserService userService;

    @GetMapping("/test")
    public String getTestUser(){
        log.debug("##############################################");
        log.debug("test :: getTestBoard() :: {}","hi");
        log.debug("##############################################");
        return userService.getTestUser();
    }
}
