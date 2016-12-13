
public class ASCLLand {
	private int position;
	
	public ASCLLand (int initialPosition){
		this.position = initialPosition;
	}
	


	public void setPosition(int moveSpaces){
		this.position += moveSpaces;
		if (this.position < 0){
			this.position = 0;
		}
	}
	
	public int getPosition(){
		return this.position;
	}
}
