/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package techmis;

import java.util.List;

/**
 *
 * @author User
 */
public interface StudentFinalMarks {
     public StudentFinalMark get(String course_id);
     public List<StudentFinalMark> list();
}
