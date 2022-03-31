package ru.abstractcoder.spring4shell.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShellController {

    @GetMapping("/shell")
    public Shell getShell(ShellRequestParameters parameters) {
        return new Shell(1, 2);
    }

    public record ShellRequestParameters(String param1, String param2) {}

    public record Shell(int a, int b) {}

}
