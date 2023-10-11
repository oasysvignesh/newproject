package oasys.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import oasys.student.Entity.MarkSheet;
import oasys.student.service.MarkService;

@RestController
@RequestMapping(value ="/marksheet")
public class MarkController {
	@Autowired
	MarkService maser;
	RestTemplate re=new RestTemplate();
	@PostMapping(value="/add")
	public MarkSheet addsemtheory(@RequestBody MarkSheet m)
	{
		String url="http://localhost:8081/getroll/4";
		ResponseEntity<Integer>rn=re.exchange(url,HttpMethod.GET,null,Integer.class);
		int val=rn.getBody();
		m.setRollnumber(val);
		return maser.addsemtheory(m);
	}
}
