package com.uy.mmollcode.minesweeperapi.repository;

import com.uy.mmollcode.minesweeperapi.entity.BoardGameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * BoardGame Repository
 *
 * @author MartinM
 */
public interface BoardGameRepository extends JpaRepository<BoardGameEntity, Long> {

    Optional<BoardGameEntity> findByUserId(String userId);

}
