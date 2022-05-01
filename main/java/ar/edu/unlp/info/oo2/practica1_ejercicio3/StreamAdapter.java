package ar.edu.unlp.info.oo2.practica1_ejercicio3;

public class StreamAdapter implements Media{
	VideoStream vs = new VideoStream();
	
	public StreamAdapter(VideoStream vs) {
		this.vs = vs;
	}
	
	public void play() {
		vs.reproduce();
	}
	
}
