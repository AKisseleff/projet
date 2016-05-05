package service;

import org.springframework.stereotype.Service;

import controller.JaxbConvertisseur;
import model.ListSTB;
import model.STB;

@Service
public class StbService {

	private ListSTB listStb;

	public StbService() {
		JaxbConvertisseur jConvert = new JaxbConvertisseur();
		this.listStb= jConvert.getListSTB();
	}
	
	public ListSTB getListStb() {
		return listStb;
	}

	public void setListStb(ListSTB listStb) {
		this.listStb = listStb;
	}
	
	public int getNbrSTB(){
		return listStb.getSTB().size();
	}

	public STB getSTBbyId(int id){
		for(STB stb : listStb.getSTB())
			if(id == stb.getId())
				return stb;
		return null;
	}

	
	
}
