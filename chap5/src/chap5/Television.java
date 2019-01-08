package chap5;

import java.rmi.RemoteException;

public class Television implements RemoteControl{
		
	int volume; 
	@Override
	public void turnOn()
	{
		System.out.println("On");
	}
	public void turnOff()
	{
		System.out.println("off");
	}
	public void setVolume(int Volume)
	{
		if(volume > RemoteControl.maxVolume)
			this.volume = RemoteControl.maxVolume; 
		else if(volume < RemoteControl.minVolume)
			this.volume = RemoteControl.maxVolume; 
		else this.volume = volume; 
	}
	
}
