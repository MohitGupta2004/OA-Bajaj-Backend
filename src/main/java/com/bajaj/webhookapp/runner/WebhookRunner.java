package com.bajaj.webhookapp.runner;

import com.bajaj.webhookapp.service.WebhookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class WebhookRunner implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(WebhookRunner.class);
    
    private final WebhookService webhookService;
    
    public WebhookRunner(WebhookService webhookService) {
        this.webhookService = webhookService;
    }
    
    @Override
    public void run(ApplicationArguments args) {
        logger.info("Starting webhook flow on application startup");
        webhookService.processWebhookFlow();
    }
} 