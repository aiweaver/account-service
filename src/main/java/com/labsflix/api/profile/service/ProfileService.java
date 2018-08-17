package com.labsflix.api.profile.service;

import java.util.List;

import com.labsflix.api.profile.repository.ProfileRepository;
import com.labsflix.api.domain.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

	private ProfileRepository profileRepository;

	@Autowired
	public ProfileService(ProfileRepository profileRepository) {
		this.profileRepository = profileRepository;
	}

	public List<Profile> getProfiles(String username) {
		return profileRepository.findByUsername(username);
	}
	
}
