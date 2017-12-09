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
	
	public void proximoCanal() throws Exception{
		if(estaLigada && canal < canalMaximo){
		   canal +=1;			
		}else{
			throw new Exception("Televisão desligada ou não há um proxímo canal");
		}		
	}
	
	
	public void canalAnterior() throws Exception{
		if(estaLigada && canal > 1){
			canal -=1;
		}else{
			throw new Exception("Televisão desligada ou não há um canal anterior");
		}
	}
	
	
	public void aumentarVolume() throws Exception{
		if(estaLigada && volume < volumeMaximo){
			volume += 1;
		}else{
			throw new Exception("Televisão desligada ou volume maxímo atingido");
		}
	}
	
	public void diminuirVolume() throws Exception{
		if(estaLigada && volume > 0){
			volume -= 1;
		}else{
			throw new Exception("Televisão desligada ou volume mínimo atingido");
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
