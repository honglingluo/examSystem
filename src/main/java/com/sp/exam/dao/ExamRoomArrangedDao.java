package com.sp.exam.dao;

import com.sp.exam.pojo.ExamRoomArranged;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExamRoomArrangedDao extends JpaRepository<ExamRoomArranged,Integer> {
    List<ExamRoomArranged> findByTimeSemester(String timeSemester);
}
