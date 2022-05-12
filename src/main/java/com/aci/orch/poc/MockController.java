package com.aci.orch.poc;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/mock")
@RestController
public class MockController {

	@PostMapping(value = "/api", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MockRes> mockApi(@RequestBody MockReq mockReq) throws InterruptedException {
		log.info("Sleep Started--------");
		Thread.sleep(50);
		log.info("Sleep Ends--------");
		return ResponseEntity.status(HttpStatus.OK).body(new MockRes("LOG-SERVICE", mockReq.getData()));
	}
}
