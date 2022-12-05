package com.its.board.service;

import com.its.board.dto.BoardDTO;
import com.its.board.entity.BoardEntity;
import com.its.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    public Long save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        return boardRepository.save(boardEntity).getId();

    }

    public List<BoardDTO> findAll() {
    }


//    public List<BoardDTO> findAll() {
//    }
}
