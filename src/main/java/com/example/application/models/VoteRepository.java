package com.example.application.models;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Vote getByName(String name);

    @Modifying
    @Query(value = "UPDATE votes SET vote = vote + 1 WHERE name = :name", nativeQuery = true)
    @Transactional
    abstract void voteFor(@Param("name") String name);
}
