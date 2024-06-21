package com.example.votingapp.service;

import com.example.votingapp.entity.Option;
import com.example.votingapp.repo.OptionRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionService {

    @Autowired
    private OptionRepo optionRepo;

    public List<Option> getAllOptions() {
        return optionRepo.findAll();
    }

    public void createVote(int optionId) {
        Option option = optionRepo.findById(optionId).orElseThrow();

        option.setVotes(option.getVotes() + 1);

        optionRepo.save(option);
    }
}
