package edu.java.httpclient;

import edu.java.dto.httpclient.StackExchangeQuestionResponse;
import edu.java.dto.httpclient.StackExchangeResponse;
import org.springframework.web.reactive.function.client.WebClient;

public class StackOverflowClient {
    private final static String BASEURL = "https://api.stackexchange.com/";
    private final static String API_VERSION = "2.3";
    private final WebClient webClient;

    public StackOverflowClient() {
        this.webClient = WebClient.create(BASEURL);
    }

    public StackOverflowClient(String baseUrl) {
        this.webClient = WebClient.create(baseUrl);
    }

    public StackExchangeQuestionResponse fetchQuestion(Long id) {
        StackExchangeResponse response = this.webClient
                .get()
                .uri(uriBuilder -> uriBuilder
                        .pathSegment(API_VERSION)
                        .pathSegment("questions")
                        .pathSegment(id.toString())
                        .queryParam("site", "stackoverflow.com")
                        .build())
                .retrieve()
                .bodyToMono(StackExchangeResponse.class)
                .block();
        return response.questions().getFirst();
    }
}
