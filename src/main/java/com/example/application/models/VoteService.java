package com.example.application.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteService {
    private final VoteRepository voteRepository;

    public VoteService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    public Vote voteFor(String name) {
        this.voteRepository.voteFor(name);
        return this.voteRepository.getByName(name);
    }
}
