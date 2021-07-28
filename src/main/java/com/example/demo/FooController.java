package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

  final Log log = LogFactory.getLog(getClass());

  @PostMapping("/")
  public String echo(@RequestHeader("k") String value, @RequestBody final String body)
      throws Exception {
    log.info(value);
    return "returned" + body;
  }

}
