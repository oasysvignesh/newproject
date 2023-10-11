package oasys.student.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import oasys.student.Entity.MarkSheet;

public interface MarkRepo extends JpaRepository<MarkSheet, Integer>{

}
