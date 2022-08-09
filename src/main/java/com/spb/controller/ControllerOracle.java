package com.spb.controller;

import com.spb.controller.domain.Message;
import com.spb.controller.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("axe")
public class ControllerOracle {
    @Autowired
    private MessageRepo messageRepo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
                           Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String getRequest(Map<String, Object> model) {

        Iterable<Message> messages = messageRepo.findAll();
        model.put("messages", messages);
        return "messages";
    }

    @PostMapping
    public String add(@RequestParam String text, @RequestParam String tag, Map<String, Object> model) {
        Message message = new Message(text, tag);

        messageRepo.save(message);//cохранили

        Iterable<Message> messages = messageRepo.findAll();
        model.put("messages", messages); //положили в репозиторий  и отдали пользователю


        return "messages";
    }
}
