package com.symbiosis.RestProject.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symbiosis.RestProject.model.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
    // You can define custom query methods here if needed
    Song findBySongId(String songId);
}