package com.tweteroo.api.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tweteroo.api.dtos.TweetDTO;
import com.tweteroo.api.models.TweetModel;
import com.tweteroo.api.models.UserModel;
import com.tweteroo.api.repositories.TweetRepository;
import com.tweteroo.api.repositories.UserRepository;

@Service
public class TweetService {
    
    final TweetRepository tweetRepository;
    final UserRepository userRepository;

    TweetService(TweetRepository tweetRepository, UserRepository userRepository){
        this.tweetRepository = tweetRepository;
        this.userRepository = userRepository;
    }

    public Optional<TweetModel> save(TweetDTO dto){
      Optional<UserModel> user = userRepository.findById(dto.getUserId());
      if(!user.isPresent()){
        return Optional.empty();
      }

      TweetModel tweet = new TweetModel(dto);
      return Optional.of(tweetRepository.save(tweet));
    }
}
