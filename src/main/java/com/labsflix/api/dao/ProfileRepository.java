package com.labsflix.api.dao;

import java.util.List;

import com.labsflix.api.vo.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, String>{
	
	List<Profile> findByUsername(String username);

}
