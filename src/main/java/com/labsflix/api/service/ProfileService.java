package com.labsflix.api.service;

import java.util.List;

import com.labsflix.api.dao.ProfileRepository;
import com.labsflix.api.vo.Profile;
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
