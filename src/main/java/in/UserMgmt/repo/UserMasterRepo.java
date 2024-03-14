package in.UserMgmt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.UserMgmt.entity.UserMaster;

public interface UserMasterRepo extends JpaRepository<UserMaster,Integer>{

	public UserMaster findByEmailAndPassword(String email,String pwd);
	public UserMaster findByEmail(String email);
}
