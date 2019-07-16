package com.microservice.chapter4


import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.body

@Component
class CustomerHandler(val customerService: CustomerService) {
    fun get(severRequest: ServerRequest) =
            ok().body(customerService.getCustomer(severRequest.pathVariable("id").toInt()))

}