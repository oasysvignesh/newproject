package oasys.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import oasys.student.Dao.MarkDao;
import oasys.student.Entity.MarkSheet;
@Service
public class MarkService {
@Autowired
MarkDao madao;
	public MarkSheet addsemtheory(MarkSheet m) {
		int temp=m.getSem1theory()+m.getSem1prac();
		m.setSem1tot(temp);
		int tem=m.getSem2prac()+m.getSem2theory();
		m.setSem2tot(tem);
		return madao.addsemtheory(m);
	}

}
