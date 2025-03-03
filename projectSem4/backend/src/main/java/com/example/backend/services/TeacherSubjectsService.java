/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.backend.services;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public interface TeacherSubjectsService {

    List<Map<String, Object>> getAllTeacher();

    List<Map<String, Object>> getTeacherByTeacherSubject(int teacherid);

    List<Map<String, Object>> getteachersubjectID(List<Integer> teacherSubjectIDs);
    
    List<Map<String, Object>> gettAllSubjectAndTeacher();
    
    void delete(Integer teacherId);
    
}
