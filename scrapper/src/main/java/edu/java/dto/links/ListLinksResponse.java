package edu.java.dto.links;

import java.util.List;

public record ListLinksResponse(List<LinkResponse> links, Integer size) {
}
