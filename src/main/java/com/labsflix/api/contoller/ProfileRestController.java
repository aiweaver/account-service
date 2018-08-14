package com.labsflix.api.contoller;

import java.util.List;

import com.labsflix.api.service.ProfileService;
import com.labsflix.api.vo.Profile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ProfileRestController {
	
	private static Logger logger = LoggerFactory.getLogger(ProfileRestController.class);

	private ProfileService profileService;

	@Autowired
	public ProfileRestController(ProfileService profileService) {
		this.profileService = profileService;
	}

	@RequestMapping(path="/{username}/profiles", method=RequestMethod.GET, name="getProfiles")
	public List<Profile> getProfiles(@PathVariable(value = "username") String username) {
		logger.debug("getProfiles() called!!");
		
		List<Profile> profiles = profileService.getProfiles(username); 
		return profiles;
	}

}
