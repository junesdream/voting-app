package com.example.votingapp.repo;

import com.example.votingapp.entity.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollRepo extends JpaRepository<Poll, Integer> {


}
