package com.training.client.controller;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "tracking", url = "http://api/v1/core/tracking")
public interface TrackingControllerFeign extends TrackingController {

}
