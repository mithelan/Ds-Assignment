package com.example.firealarm.Repository;

import com.example.firealarm.model.Roomdetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FireAlarmRepo extends JpaRepository<Roomdetails,Integer> {
}
