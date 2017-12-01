package classesParaTeste;

public class Televisao {

	boolean estaLigada;
	int canal, volume, canalMaximo, volumeMaximo;
	
	
	public Televisao(){
		estaLigada = false;
		canal = 1;
		canalMaximo = 10;
		volume = 0;
		volumeMaximo = 50;					
	}
	
	
	public void ligar(){		
		if(!estaLigada){			
			estaLigada = true;			
		}				
	}
	
	
	public void desligar(){		
		if(estaLigada){
			estaLigada = false;
		}
	}
	
	public void addCanal() throws Exception{
		if(estaLigada && canal < canalMaximo){
		   canal +=1;			
		}else{
			throw new Exception("Televisão desligada ou atingido o limite maxímo de canais");
		}		
	}
	
	
	public void subCanal() throws Exception{
		if(estaLigada && canal > 1){
			canal -=1;
		}else{
			throw new Exception("Televisão desligada ou atingido o limite mínimo de canais");
		}
	}
	
	
	public void addVolume(){
		if(estaLigada && volume < volumeMaximo){
			volume += 1;
		}		
	}
	
	public void subVolume(){
		if(estaLigada && volume > 0){
			volume -= 1;
		}		
	}
	

	public boolean getEstaLigada() {
		return estaLigada;
	}


	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}
	

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}				
}
