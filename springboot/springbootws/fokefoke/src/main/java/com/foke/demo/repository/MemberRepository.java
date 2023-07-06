package com.foke.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.foke.demo.dto.MemberDTO;

@Repository
@Transactional
public interface MemberRepository extends JpaRepository<MemberDTO, String> {
	int countByMemberId(String memberId);

	Optional<MemberDTO> findBymemberId(String memberId);

	Optional<MemberDTO> findByMemberNameAndPhone(String memberName, String phone);

	void deleteByMemberId(String memberId);

	List<MemberDTO> findByMemberIdLike(String memberId);
}