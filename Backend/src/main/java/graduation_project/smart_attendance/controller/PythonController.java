package graduation_project.smart_attendance.controller;

import graduation_project.smart_attendance.dto.FindAccountDto;
import graduation_project.smart_attendance.service.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
@Slf4j
public class PythonController {

    private final AccountService accountService;

    @PostMapping("/python/login")
    public String login(@RequestBody FindAccountDto findAccountDto){
        log.info("username: {}, password: {}", findAccountDto.getUsername(), findAccountDto.getPassword());
        if(accountService.findUser(findAccountDto)){
            return "True";
        }
        return "False";
    }
}