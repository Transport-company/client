package com.training.client.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import com.training.core.controller.TrackingControleer;

@FeignClient(name = "TrackingClient",
        url = "${coreTrackingAPIUrl}")
public class TrackingClient implements TrackingController {


}
