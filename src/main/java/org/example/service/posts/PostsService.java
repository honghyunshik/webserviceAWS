package org.example.service.posts;

import lombok.RequiredArgsConstructor;
import org.example.domain.posts.PostsRepository;
import org.example.web.dto.PostsSaveRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    //트랜잭션이란? 더 이상 쪼개질 수 없는 최소의 연산
    //독립적으로 이루어지며, 과정 중에 다른 연산이 끼어들 수 없고, 성공할 경우 결과를 반영하고 실패하면 이전 상태로 돌린다.
    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }

}
