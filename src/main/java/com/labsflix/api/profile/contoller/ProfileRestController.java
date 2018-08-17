package com.labsflix.api.profile.contoller;

import java.util.List;

import com.labsflix.api.profile.service.ProfileService;
import com.labsflix.api.domain.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class ProfileRestController {
	
	private ProfileService profileService;

	@Autowired
	public ProfileRestController(ProfileService profileService) {
		this.profileService = profileService;
	}

	@GetMapping("/{username}/profiles")
	public List<Profile> getProfiles(@PathVariable(value = "username") String username) {
		return profileService.getProfiles(username);
	}

}
