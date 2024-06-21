package com.example.votingapp.repo;

import com.example.votingapp.entity.Option;
import com.example.votingapp.entity.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepo extends JpaRepository<Option, Integer> {
}
