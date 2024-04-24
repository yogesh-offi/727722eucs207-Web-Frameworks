package com.project1.day7queryusingjpa.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day7queryusingjpa.Model.Door;

@Repository
public interface DoorRepo extends JpaRepository<Door,Integer>{

    @Query("select D from Door D where accessType = :at")
    List<Door> getBYAccessType(String at);

}
