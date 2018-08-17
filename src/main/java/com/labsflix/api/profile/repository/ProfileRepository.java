package com.labsflix.api.profile.repository;

import java.util.List;

import com.labsflix.api.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, String>{
	
	List<Profile> findByUsername(String username);

}
