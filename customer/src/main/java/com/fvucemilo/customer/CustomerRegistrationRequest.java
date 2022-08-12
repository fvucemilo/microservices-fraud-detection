package com.fvucemilo.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
