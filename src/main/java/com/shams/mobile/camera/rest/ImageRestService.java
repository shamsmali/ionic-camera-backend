package com.shams.mobile.camera.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shams.mobile.camera.rest.domain.File;

@RestController
@RequestMapping("/image")
public class ImageRestService {

	@RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = "application/json")
	public File upload(@RequestBody File file) {
		System.out.println(file);
		return file;
	}
}
