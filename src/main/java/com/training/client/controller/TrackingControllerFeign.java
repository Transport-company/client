package com.training.client.controller;

import com.training.client.Urls;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Urls.Tracking.FULL)
public interface TrackingControllerFeign extends TrackingController {

}
