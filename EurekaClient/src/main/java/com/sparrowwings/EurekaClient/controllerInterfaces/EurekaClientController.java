package com.sparrowwings.EurekaClient.controllerInterfaces;

import org.springframework.web.bind.annotation.RequestMapping;

public interface EurekaClientController {
	@RequestMapping("/Client")
	String greeting();
}
