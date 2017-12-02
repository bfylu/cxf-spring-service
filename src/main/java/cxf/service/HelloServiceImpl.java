package cxf.service;

import javax.jws.WebService;

@WebService(endpointInterface = "cxf.service.HelloService")
public class HelloServiceImpl implements HelloService {
    public String sayHello(String content) {
        return "hello," + content;
    }
}
