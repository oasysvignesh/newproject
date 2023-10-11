package oasys.student.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import oasys.student.Entity.MarkSheet;
import oasys.student.Repositary.MarkRepo;
@Repository
public class MarkDao {
@Autowired
MarkRepo marepo;
	public MarkSheet addsemtheory(MarkSheet m) {
		
		return marepo.save(m);
	}

}
